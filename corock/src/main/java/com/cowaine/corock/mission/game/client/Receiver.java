package com.cowaine.corock.mission.game.client;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

class Receiver extends Thread {

    private final DataInputStream in;

    Receiver(Socket socket) throws IOException {
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
            String response = in.readUTF();
            if (isQuitTheGame(response)) {
                this.interrupt();
                System.exit(0);
            }
            System.out.print(response);
        } catch (IOException e) {
            System.err.println(e.getMessage());
        }
    }

    private boolean isQuitTheGame(String response) {
        return response.equals("quit");
    }

}
