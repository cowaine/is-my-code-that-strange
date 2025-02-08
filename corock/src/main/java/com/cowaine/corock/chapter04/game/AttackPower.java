package com.cowaine.corock.chapter04.game;

public class AttackPower {

    static final int MIN = 0;

    public final int value;

    public AttackPower(int value) {
        if (value < MIN) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    /**
     * 공격력을 강화한다.
     *
     * @param increment 공격력 증가량
     * @return 증가된 공격력
     */
    public AttackPower reinforce(AttackPower increment) {
        return new AttackPower(this.value + increment.value);
    }

    /**
     * 공격력을 무력화한다.
     *
     * @return 무력화한 공격력
     */
    public AttackPower disable() {
        return new AttackPower(MIN);
    }

}
