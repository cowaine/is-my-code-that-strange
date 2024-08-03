package com.cowaine.corock.mission.game;

import java.io.IOException;

class GameServerShell {
    public static void main(String[] args) throws IOException {
        GameServer server = new GameServer();
        server.start();
    }
}
