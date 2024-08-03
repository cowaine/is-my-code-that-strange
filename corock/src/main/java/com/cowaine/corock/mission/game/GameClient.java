package com.cowaine.corock.mission.game;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * A GameClient is a client that uses the game.
 */
public class GameClient {
    private final String userId;

    public GameClient(String userId) {
        this.userId = userId;
    }

    void connect(String serverHost, String port) {
        try {
            Socket socket = new Socket(serverHost, Integer.parseInt(port));
            System.out.println(
                "Connected to the last kingdom server: '" + serverHost + ":" + port + "'");

            Thread sender = new Sender(socket, userId);
            sender.start();

            Thread receiver = new Receiver(socket);
            receiver.start();
        } catch (UnknownHostException e) {
            System.err.println("UnknownHostException: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}
