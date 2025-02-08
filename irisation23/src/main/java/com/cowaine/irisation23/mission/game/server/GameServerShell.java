package com.cowaine.irisation23.mission.game.server;

import java.io.IOException;

public class GameServerShell {

    public static void main(String[] args) throws IOException {
        GameServer server = new GameServer();
        server.start();
    }

}
