package com.cowaine.corock.mission.game.server;

import com.cowaine.corock.mission.game.domain.command.Command;
import com.cowaine.corock.mission.game.domain.command.CommandResolver;
import com.cowaine.corock.mission.game.domain.command.CommandResult;
import com.cowaine.corock.mission.game.domain.command.Sendable;
import com.cowaine.corock.mission.game.domain.message.GameMessage;
import lombok.Getter;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Getter
public class ClientSession extends Thread implements Sendable {

    private final Map<String, DataOutputStream> clientOutMap;
    private final Socket socket;
    private final DataInputStream in;
    private final DataOutputStream out;
    private String userId;

    public ClientSession(Socket socket) throws IOException {
        this.clientOutMap = new ConcurrentHashMap<>();
        this.socket = socket;
        this.in = new DataInputStream(socket.getInputStream());
        this.out = new DataOutputStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        initialize();
        try {
            connect();
        } catch (InterruptedException ie) {
            System.err.println("InterruptedException: " + ie);
            Thread.currentThread().interrupt();
        }
    }

    private void initialize() {
        try {
            this.userId = in.readUTF();
            joinGame(this);
            this.sendClientLandingPage();
        } catch (IOException cause) {
            System.err.println("[ERROR] 아이디를 식별할 수 없습니다: " + cause.getMessage());
            cause.printStackTrace();
        }
    }

    private void connect() throws InterruptedException {
        try {
            // 여러 ConcreteCommand 에서 Command 를 결정
            CommandResolver commandResolver = new CommandResolver(this.userId);

            while (isConnect()) {
                String request = in.readUTF();

                Command command = commandResolver.resolve(request, this);
                if (command == null) {
                    throw new IllegalArgumentException("입력한 명령이 없습니다. 적절한 명령을 입력하세요.");
                }

                CommandResult result = command.execute(/* ... */);

                List<String> messages = result.getMessages();
                for (String message : messages) {
                    this.send(message);
                }
                if (result.isGameQuit()) {
                    break;
                }
            }
        } catch (IOException cause) {
            System.out.println(GameMessage.getServerThreadInfo(getTime())
                    + this.userId + " 이(가) Dragon 몬스터를 제거했습니다.");
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

    @Override
    public void send(String message) {
        this.sendMessageToClient(message);
    }

    @Override
    public void sendToAll(String message) {
        this.sendMessageToAllClients(message);
    }

    public void sendMessageToClient(String message) {
        try {
            this.out.writeUTF(message);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private void sendMessageToAllClients(String message) {
        for (DataOutputStream dataOutputStream : clientOutMap.values()) {
            try {
                dataOutputStream.writeUTF(message);
            } catch (IOException e) {
                System.err.println(e.getMessage());
            }
        }
    }

    private void loggingCurrentClientCount() {
        System.out.println(GameMessage.getServerThreadInfo(getTime())
                + "Currently " + clientOutMap.size() + " clients are connected.");
    }

    private void joinGame(ClientSession session) {
        clientOutMap.put(session.userId, session.out);

        System.out.println(GameMessage.getServerThreadInfo(getTime())
                + session.userId + " is joined: " + session.socket.getInetAddress());
        loggingCurrentClientCount();
    }

    private void leaveGame(ClientSession session) {
        clientOutMap.remove(session.userId);

        System.out.println(GameMessage.getServerThreadInfo(getTime())
                + session.userId + " is leaved: " + session.socket.getInetAddress());
        loggingCurrentClientCount();
    }

    private void sendClientLandingPage() {
        this.send(GameMessage.getAsciiArtDragon());
        this.send(GameMessage.getPressEnterToContinue());
    }

    private String getTime() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss"));
    }
}
