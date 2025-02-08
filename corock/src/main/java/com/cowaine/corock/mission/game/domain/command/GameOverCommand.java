package com.cowaine.corock.mission.game.domain.command;

/**
 * GameStartCommand executes actions when the specific player is over.
 */
public class GameOverCommand implements Command {
    @Override
    public CommandResult execute() {
        return new CommandResult(null, true);
    }
}
