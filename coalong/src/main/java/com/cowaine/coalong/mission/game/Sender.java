package com.cowaine.coalong.mission.game;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Sender extends Thread {

    private final String id;
    private final DataOutputStream out;

    Sender(Socket socket, String id) throws IOException {
        this.id = id;
        this.out = new DataOutputStream(socket.getOutputStream());
    }

    @Override
    public void run() {
        try {
            initialize();
            sendMessage();
        } catch (IOException e) {
        }
    }

    private void initialize() throws IOException {
        if (isSendable()) {
            this.out.writeUTF(id);
        }
    }

    private boolean isSendable() {
        return this.out != null;
    }

    private void sendMessage() throws IOException {
        try (Scanner scanner = new Scanner(System.in)) {
            while (isSendable()) {
                this.out.writeUTF("[" + id + "] " + scanner.nextLine());
            }
        }
    }

}
