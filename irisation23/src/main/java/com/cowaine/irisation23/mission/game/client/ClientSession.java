package com.cowaine.irisation23.mission.game.client;

import static com.cowaine.irisation23.mission.game.imamge.ConsoleImage.DRAGON;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.concurrent.ConcurrentHashMap;

public class ClientSession extends Thread {

    // key: 클라이언트 ID, value: 클라이언트 전송용 OutputStream
    private final ConcurrentHashMap<String, DataOutputStream> clientOutMap;
    private final Socket socket;
    private final DataInputStream in;
    private final DataOutputStream out;
    private String id;

    public ClientSession(Socket socket) throws IOException {
        this.clientOutMap = new ConcurrentHashMap<>();
        this.socket = socket;
        this.in = new DataInputStream(socket.getInputStream());
        this.out = new DataOutputStream(socket.getOutputStream());
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
        } catch (IOException cause) {
            // TODO: 최초 통신(아이디 받기)이 실패하는 경우

        }
    }

    private String getTime() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss"));
    }

    private void joinGame(ClientSession session) {
        clientOutMap.put(session.id, session.out);

        sendToAll("[System] " + session.id + " 님이 입장했습니다.");
        sendToAll(DRAGON.getImage());
        sendToAll("=== 계속 하려면 엔터를 입력해주세요. ===");
        System.out.println(getTime() + " " + session.id + " is joined: " + session.socket.getInetAddress());
        loggingCurrentClientCount();

    }

    private void loggingCurrentClientCount() {
        System.out.println(getTime() + " Currently " + clientOutMap.size() + " clients are connected.");
    }

    private void sendToAll(String message) {
        for (DataOutputStream out : clientOutMap.values()) {
            try {
                out.writeUTF(message);
            } catch (IOException e) {
                // TODO: 해당 클라이언트로 송출 스트림이 실패함(네트워크 끊김)

            }
        }
    }

    private void connect() {
        try {
            while (isConnect()) {
                sendToAll(in.readUTF());
            }
        } catch (IOException cause) {
            // TODO: 채팅 중 연결이 끊기는 경우

        } finally {
            disconnect();
        }
    }

    private boolean isConnect() {
        return this.in != null;
    }

    private void disconnect() {
        leaveGame(this);
    }

    private void leaveGame(ClientSession session) {
        clientOutMap.remove(session.id);

        System.out.println("[System] " + session.id + " 님이 나갔습니다.");
        System.out.println(getTime() + " " + session.id + " is leaved: " + session.socket.getInetAddress());
        loggingCurrentClientCount();
    }

}
