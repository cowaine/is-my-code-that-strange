package com.cowaine.corock.mission.game.domain.command;

import com.cowaine.corock.mission.game.domain.character.Stage;

import java.util.ArrayList;
import java.util.List;

/**
 * CreateStageCommand executes creating stages and provides player character.
 */
public class CreateStageCommand implements Command {
    private final Stage stage;

    public CreateStageCommand(Stage stage) {
        this.stage = stage;
    }

    private String getStageMessage(Stage stage) {
        return stage.getMessage();
    }

    @Override
    public CommandResult execute() {
        List<String> messages = new ArrayList<>();
        messages.add(getStageMessage(this.stage));
        return new CommandResult(messages, false);
    }
}
