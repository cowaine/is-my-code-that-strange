package com.cowaine.corock.mission.game.domain.command;

import java.util.List;

/**
 * CommandResult represents a concrete command object.
 */
public class CommandResult {
    private final List<String> messages;
    private final boolean isGameQuit;

    public CommandResult(List<String> messages, boolean isGameQuit) {
        this.messages = messages;
        this.isGameQuit = isGameQuit;
    }

    public List<String> getMessages() {
        return messages;
    }

    public boolean isGameQuit() {
        return isGameQuit;
    }
}
