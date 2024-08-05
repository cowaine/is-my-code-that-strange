package com.cowaine.coalong.mission.game.socket;

import java.io.IOException;

public class GameServerShell {

    public static void main(String[] args) throws IOException {
        GameServer server = new GameServer();
        server.start();
    }

}
