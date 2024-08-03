package com.cowaine.corock.mission.game;

import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class Sender extends Thread {
    private final DataOutputStream out;
    private final String userId;

    public Sender(Socket socket, String userId) throws IOException {
        this.out = new DataOutputStream(socket.getOutputStream());
        this.userId = userId;
    }

    @Override
    public void run() {
        try {
            initialize();
            sendMessage();
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private void initialize() throws IOException {
        if (isSendable()) {
            this.out.writeUTF(userId);
        }
    }

    private boolean isSendable() {
        return this.out != null;
    }

    private void sendMessage() throws IOException {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (isSendable()) {
                this.out.writeUTF(reader.readLine());
            }
        }
    }
}
