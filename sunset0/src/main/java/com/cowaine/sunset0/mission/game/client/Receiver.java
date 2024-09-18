package com.cowaine.sunset0.mission.game.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

public class Receiver extends Thread {

    private final DataInputStream in;

    public Receiver(Socket socket) throws IOException {
        this.in = new DataInputStream(socket.getInputStream());
    }

    @Override
    public void run() {
        while (isReceivable()) {
            receiveMessage();
        }
    }

    private boolean isReceivable() {
        return this.in != null;
    }

    private void receiveMessage() {
        try {
            System.out.println(in.readUTF());
        } catch (IOException e) {
        }
    }

}
