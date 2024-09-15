package com.cowaine.corock.mission.game.client;

import com.cowaine.corock.mission.game.server.ServerConfig;

/**
 * Game client in the shell.
 */
public class GameClientShell {

    /**
     * The main method for playing the game.
     *
     * @param args The user's ID
     */
    public static void main(String[] args) {
        if (args.length == 0) {
            throw new IllegalArgumentException("게임에 사용할 아이디를 설정해주세요.");
        }

        String userId = args[0];
        GameClient client = new GameClient(userId);

        client.connect(ServerConfig.serverHost(), ServerConfig.port());
    }

}
