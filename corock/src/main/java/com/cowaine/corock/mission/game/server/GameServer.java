package com.cowaine.corock.mission.game.server;

import com.cowaine.corock.mission.game.domain.message.GameMessage;

import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * A GameServer is a server that uses the game.
 */
class GameServer {

    private final Map<String, DataOutputStream> clientOutMap = new ConcurrentHashMap<>();

    /**
     * This method creates a client session and starts the game.
     *
     * @throws IOException - When the game client fails to connect
     */
    void start() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(ServerConfig.port());
             BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out))) {

            writer.write(GameMessage.getServerThreadInfo(getTime())
                    + "Starting the last kingdom server version 1.0.0" + System.lineSeparator());
            writer.write(GameMessage.getServerThreadInfo(getTime())
                    + "Server is listening on port " + serverSocket.getLocalPort()
                    + System.lineSeparator());
            writer.flush();

            while (true) {
                try {
                    Socket socket = serverSocket.accept();
                    ClientSession client = new ClientSession(socket, clientOutMap);
                    client.start();
                    if (client.getIn() == null) {
                        break;
                    }
                } catch (IOException e) {
                    System.err.println("게임 클라이언트가 접속에 실패했습니다: " + e.getMessage());
                }
            }
        }
    }

    private String getTime() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss"));
    }

}
