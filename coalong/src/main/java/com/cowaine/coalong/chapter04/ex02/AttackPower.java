package com.cowaine.coalong.chapter04.ex02;

public class AttackPower {
    static final int MIN = 0;
    int value; // final 을 붙이지 않았으므로 가변

    AttackPower(int value) {
        if (value < MIN) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    /**
     * 공격력 강화하기
     * @param increment 공격력 증가량
     */
    void reinforce(int increment) {
        value += increment;
    }

    /**
     * 무력화하기
     */
    void disable() {
        value = MIN;
    }
}
