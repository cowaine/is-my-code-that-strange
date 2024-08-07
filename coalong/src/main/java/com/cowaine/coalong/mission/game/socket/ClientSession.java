package com.cowaine.coalong.mission.game.socket;


import com.cowaine.coalong.mission.game.service.GameService;
import com.cowaine.coalong.mission.game.ui.OutputView;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;


public class ClientSession extends Thread {

    private final Socket socket;
    private final Map<String, DataOutputStream> clientOutMap;
    private final DataInputStream in;
    private final DataOutputStream out;
    private String id;
    private final GameService gameService;

    ClientSession(Socket socket, Map<String, DataOutputStream> clientOutMap, GameService gameService) throws IOException {
        this.socket = socket;
        this.clientOutMap = clientOutMap;
        this.in = new DataInputStream(socket.getInputStream());
        this.out = new DataOutputStream(socket.getOutputStream());
        this.gameService = gameService;
    }

    @Override
    public void run() {
        initialize();
        connect();
    }

    private void initialize() {
        try {
            this.id = in.readUTF();
            joinGame(this);
            OutputView.printLandingPage(this.out);
        } catch (IOException cause) {
            // TODO: 최초 통신(아이디 받기)이 실패하는 경우
        }
    }

    private void connect() {
        try {
            while (isConnect()) {
                String command = in.readUTF();
            }
        } catch (IOException cause) {
            // TODO: 채팅 중 연결이 끊기는 경우
        } finally {
            disconnect();
        }
    }

    private void joinGame(ClientSession session) {
        clientOutMap.put(session.id, session.out);
        sendToAll("[System] " + session.id + " 님이 입장했습니다.");
        System.out.println(getTime() + " " + session.getId() + " is joined: " + session.socket.getInetAddress());
        loggingCurrentClientCount();
    }

    private void leaveGame(ClientSession session) {
        clientOutMap.remove(session.id);
        sendToAll("[System] " + session.id + " 님이 나갔습니다.");
        System.out.println(getTime() + " " + session.id + " is leaved: " + session.socket.getInetAddress());
        loggingCurrentClientCount();
    }

    private boolean isConnect() {
        return this.in != null;
    }

    private void disconnect() {
        leaveGame(this);
    }

    private void sendToAll(String message) {
        for (DataOutputStream out : clientOutMap.values()) {
            try {
                OutputView.print(out, message);
            } catch (IOException e) {
                // TODO: 해당 클라이언트로 송출 스트림이 실패함(네트워크 끊김)
            }
        }
    }

    private void sendToUser(String message) throws IOException {
        OutputView.print(this.out, message);
    }

    private void loggingCurrentClientCount() {
        System.out.println(getTime() + " Currently " + clientOutMap.size() + " clients are connected.");
    }

    private String getTime() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss"));
    }

}
