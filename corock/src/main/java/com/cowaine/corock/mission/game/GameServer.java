package com.cowaine.corock.mission.game;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class GameServer {

    public void start() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(8080)) {
            System.out.println(getTime() + " Start server " + serverSocket.getLocalSocketAddress());

            while (true) {
                try {
                    Socket socket = serverSocket.accept();
                    ClientSession client = new ClientSession(socket);
                    client.start();
                } catch (IOException e) {
                    // TODO: 클라이언트 접속 실패

                }
            }
        }
    }

    private String getTime() {
        return LocalTime.now().format(DateTimeFormatter.ofPattern("hh:mm:ss"));
    }

}
