package com.cowaine.coalong.mission.game.socket;

import lombok.RequiredArgsConstructor;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

@RequiredArgsConstructor
public class GameClient {

    private final String id;

    void connect(String serverHost, int port) {
        try {
            Socket socket = new Socket(serverHost, port);
            System.out.println("Connected to server: " + serverHost + ":" + port);

            Thread sender = new Sender(socket, id);
            Thread receiver = new Receiver(socket);

            sender.start();
            receiver.start();

        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
