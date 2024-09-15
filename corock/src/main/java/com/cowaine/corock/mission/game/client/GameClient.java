package com.cowaine.corock.mission.game.client;

import com.cowaine.corock.mission.game.io.OutputView;

import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

/**
 * A GameClient is a client that uses the game.
 */
class GameClient {

    private final String userId;

    GameClient(String userId) {
        this.userId = userId;
    }

    void connect(String serverHost, int port) {
        try {
            Socket socket = new Socket(serverHost, port);
            OutputView.printConnectToServer(serverHost, port);

            Thread sender = new Sender(socket, userId);
            sender.start();

            Thread receiver = new Receiver(socket);
            receiver.start();

        } catch (UnknownHostException e) {
            OutputView.printUnknownHostException(e.getMessage());
        } catch (IOException e) {
            OutputView.printIoException(e.getMessage());
        }
    }

}
