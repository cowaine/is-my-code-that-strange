package com.cowaine.corock.mission.game.server;

import java.io.IOException;

public class GameServerShell {

    public static void main(String[] args) throws IOException {
        new GameServer().start();
    }

}
