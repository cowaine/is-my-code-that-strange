package com.cowaine.corock.mission.game.server;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@NoArgsConstructor(access = AccessLevel.PRIVATE)
public class ServerConfig {

    private static final String DEFAULT_SERVER_HOST = "127.0.0.1";
    private static final int DEFAULT_PORT = 8889;

    public static String serverHost() {
        return DEFAULT_SERVER_HOST;
    }

    public static int port() {
        return DEFAULT_PORT;
    }

}
