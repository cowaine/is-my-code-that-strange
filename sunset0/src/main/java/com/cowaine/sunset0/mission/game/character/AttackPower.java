package com.cowaine.sunset0.mission.game.character;

public class AttackPower {

    private static final int MIN = 0;
    private int value;

    public AttackPower(final int value) {
        validateAttackPower(value);
        this.value = value;
    }

    private static void validateAttackPower(int value) {
        if (value < MIN) {
            throw new IllegalArgumentException("공격력은 0보다 작을 수 없습니다.");
        }
    }

    /**
     * 공격력 강화
     * @param increment
     * @return 강화된 후 공격력
     */
    public AttackPower reinforce(final AttackPower increment) {
        return new AttackPower(this.value + increment.value);
    }

    public int get() {
        return value;
    }
}
