package com.cowaine.corock.mission.game.domain.character;

import java.security.SecureRandom;

/**
 * A Soldier is a kind of player character(PC).
 */
public class Soldier extends PlayerCharacter {

    public Soldier(String userId, int level, int hp, int power, String name) {
        super(userId, level, hp, power, name);
    }

    @Override
    public String toString() {
        return "=== " + super.getName() + " 정보 ===" + System.lineSeparator()
            + "- 아이디: " + super.getUserId() + System.lineSeparator()
            + "- 레벨: " + super.getLevel() + System.lineSeparator()
            + "- 체력: " + super.getHp() + System.lineSeparator()
            + "- 공격력: " + super.getPower() + System.lineSeparator();
    }

    @Override
    public void attack(GameCharacter other) {
        int foo = new SecureRandom().nextInt(super.getPower()) + 1;
        other.takeHit(foo);
    }

    @Override
    public String getMessage() {
        return null;
    }
}
