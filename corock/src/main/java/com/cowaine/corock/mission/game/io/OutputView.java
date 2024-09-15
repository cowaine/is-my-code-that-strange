package com.cowaine.corock.mission.game.io;

import lombok.AccessLevel;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor(access = AccessLevel.PRIVATE)
public final class OutputView {

    public static void printConnectToServer(String serverHost, int port) {
        log.info("Connected to the server: {}:{}", serverHost, port);
    }

    public static void printUnknownHostException(String message) {
        log.error("UnknownHostException: {}", message);
    }

    public static void printIoException(String message) {
        log.error("IOException: {}", message);
    }

}
