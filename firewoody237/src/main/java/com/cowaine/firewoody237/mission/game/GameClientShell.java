package com.cowaine.firewoody237.mission.game;

public class GameClientShell {

    public static void main(String[] args) {
        if (hasNotArgs(args)) {
            System.err.println("게임에서 사용할 아이디를 설정해 주세요.");
            return;
        }
        String userId = args[0];
        GameClient client = new GameClient(userId);
        client.connect("127.0.0.1", 8080);
    }

    private static boolean hasNotArgs(String[] args) {
        return args.length == 0;
    }

}
