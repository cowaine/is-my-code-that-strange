package com.cowaine.corock.mission.game.domain.command;

/**
 * Sendable is the interface for sending messages to a client by using facade pattern.
 */
public interface Sendable {
    void send(String message);

    void sendToAll(String message);
}
