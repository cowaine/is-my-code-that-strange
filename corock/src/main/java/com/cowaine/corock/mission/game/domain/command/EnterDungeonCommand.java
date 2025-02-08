package com.cowaine.corock.mission.game.domain.command;

import java.util.ArrayList;
import java.util.List;

/**
 * EnterDungeonCommand executes actions when the player enters the dungeon.
 */
public class EnterDungeonCommand implements Command {
    @Override
    public CommandResult execute() {
        List<String> messages = new ArrayList<>();
        return new CommandResult(messages, false);
    }
}
