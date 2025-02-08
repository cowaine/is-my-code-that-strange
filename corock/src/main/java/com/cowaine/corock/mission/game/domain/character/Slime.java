package com.cowaine.corock.mission.game.domain.character;

/**
 * A Slime is a kind of non-player character(NPC).
 */
public class Slime extends NonPlayerCharacter {
    public Slime(int level, int hp, int power, String name) {
        super(level, hp, power, name);
    }

    @Override
    public String getMessage() {
        return System.lineSeparator() + "야생의 " + super.getName() + "이 나타났다."
            + System.lineSeparator()
            + "1. 공격" + System.lineSeparator()
            + "2. 도망간다. (게임 종료)" + System.lineSeparator()
            + ">>> ";
    }
}
