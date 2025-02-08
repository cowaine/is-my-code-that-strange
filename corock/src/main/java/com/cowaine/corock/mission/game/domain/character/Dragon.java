package com.cowaine.corock.mission.game.domain.character;

import java.security.SecureRandom;

/**
 * A Dragon is one of the non-player character(NPC).
 */
public class Dragon extends NonPlayerCharacter {
    public Dragon(int level, int hp, int power, String name) {
        super(level, hp, power, name);
    }

    @Override
    public String getMessage() {
        return "*보스* " + super.getName() + "이 나타났다." + System.lineSeparator()
            + "1. 공격" + System.lineSeparator()
            + "2. 도망간다. (게임 종료)" + System.lineSeparator() + ">>> ";
    }

    @Override
    public void attack(GameCharacter other) {
        int dragonBreathProbability = new SecureRandom().nextInt(super.getPower()) + 1;
        int strength = new SecureRandom().nextInt(super.getPower()) + 1;
        if (dragonBreathProbability == Stats.DRAGON_SPECIAL_MOVE.getValue()) {
            other.takeHit(Stats.DRAGON_BREATH.getValue());
            return;
        }
        other.takeHit(strength);
    }
}
