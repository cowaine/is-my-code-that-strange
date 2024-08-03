package com.cowaine.corock.mission.game;

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
        if (hasNotArgs(args)) {
            throw new IllegalArgumentException("게임에 사용할 아이디를 설정해주세요.");
        }
        String userId = args[Integer.parseInt(Config.USER_ID.getValue())];
        GameClient client = new GameClient(userId);
        client.connect(Config.SERVER_HOST.getValue(), Config.PORT.getValue());
    }

    private static boolean hasNotArgs(String[] args) {
        return args.length == 0;
    }
}
