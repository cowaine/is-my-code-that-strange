package com.cowaine.corock.mission.game.domain.command;

import com.cowaine.corock.mission.game.domain.message.GameMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * GameQuitCommand executes quit the game actions.
 */
public class GameQuitCommand implements Command {
    @Override
    public CommandResult execute() {
        List<String> messages = new ArrayList<>();
        messages.add(GameMessage.getQuitTheGameMessage());
        messages.add("quit");
        return new CommandResult(messages, true);
    }
}
