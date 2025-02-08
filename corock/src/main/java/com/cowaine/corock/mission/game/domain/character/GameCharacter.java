package com.cowaine.corock.mission.game.domain.character;

import java.security.SecureRandom;

/**
 * A GameCharacter is an abstract class implementing Attackable and Runnable.
 */
public abstract class GameCharacter implements Attackable, Runnable {
    private int level;
    private int hp;
    private int power;
    private final String name;
    private int damage;
    private GameCharacter enemy;

    GameCharacter(int level, int hp, int power, String name) {
        this.level = level;
        this.hp = hp;
        this.power = power;
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public void setEnemy(GameCharacter enemy) {
        this.enemy = enemy;
    }

    protected void takeHit(int power) {
        this.damage = power;
        int strength = this.hp - power;
        if (strength < 0) {
            this.setHp(0);
            return;
        }
        this.setHp(strength);
    }

    public abstract String getMessage();

    public void attack(GameCharacter other) {
        other.takeHit(new SecureRandom().nextInt(this.getPower()) + 1);
    }

    @Override
    public void run() {
        synchronized (this) {
            this.attack(this.enemy);
        }
    }

    interface Displayable {
        int getValue();
    }

    /**
     * A Stats class is an enum types that GameCharacter has.
     */
    public enum Stats implements Displayable {
        SOLDIER_INIT_LEVEL(1), SOLDIER_INIT_HP(100), SOLDIER_INIT_POWER(10),
        SLIME_LEVEL(1), SLIME_HP(30), SLIME_POWER(4),
        ORC_LEVEL(2), ORC_HP(40), ORC_POWER(6),
        DRAGON_LEVEL(3), DRAGON_HP(100), DRAGON_POWER(10),
        DRAGON_SPECIAL_MOVE(7), DRAGON_BREATH(15);

        private final int value;

        Stats(int value) {
            this.value = value;
        }

        @Override
        public int getValue() {
            return value;
        }
    }
}
