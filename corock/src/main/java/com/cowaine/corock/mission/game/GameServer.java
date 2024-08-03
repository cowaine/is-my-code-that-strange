package com.cowaine.corock.mission.game;

import com.cowaine.corock.mission.game.domain.message.GameMessage;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

import static com.cowaine.corock.mission.game.Config.PORT;

/**
 * A GameServer is a server that uses the game.
 */
public class GameServer {
    /**
     * This method creates a client session and starts the game.
     *
     * @throws IOException - When the game client fails to connect
     */
    public void start() throws IOException {
        try (ServerSocket serverSocket = new ServerSocket(Integer.parseInt(PORT.getValue()));
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
                    ClientSession client = new ClientSession(socket);
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
