package com.cowaine.corock.mission.game.domain.character;

/**
 * A NonPlayerCharacter a class that derives from GameCharacter.
 */
public class NonPlayerCharacter extends GameCharacter {
    NonPlayerCharacter(int level, int hp, int power, String name) {
        super(level, hp, power, name);
    }

    @Override
    public String getMessage() {
        return null;
    }
}
