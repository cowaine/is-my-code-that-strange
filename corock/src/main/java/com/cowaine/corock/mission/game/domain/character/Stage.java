package com.cowaine.corock.mission.game.domain.character;

/**
 * A Stage provides a message function to convey to users who the monsters in the current game are.
 */
public class Stage {
    private GameCharacter monster;

    public Stage(GameCharacter monster) {
        this.monster = monster;
    }

    public String getMessage() {
        return monster.getMessage();
    }

    public GameCharacter getMonster() {
        return monster;
    }

    public static Stage prepareStage(GameCharacter character) {
        return new Stage(character);
    }
}
