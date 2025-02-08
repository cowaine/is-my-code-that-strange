package com.cowaine.corock.mission.game.domain.command;

import com.cowaine.corock.mission.game.domain.character.PlayerCharacter;
import com.cowaine.corock.mission.game.domain.message.GameMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * GameStartCommand executes starting actions for the game.
 */
public class GameStartCommand implements Command {
    private final PlayerCharacter soldier;

    public GameStartCommand(PlayerCharacter soldier) {
        this.soldier = soldier;
    }

    @Override
    public CommandResult execute() {
        List<String> messages = new ArrayList<>();
        messages.add(soldier + System.lineSeparator());
        messages.add(GameMessage.getGameStartMessage(soldier));

        return new CommandResult(messages, false);
    }
}
