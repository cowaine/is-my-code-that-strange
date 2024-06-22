package com.cowaine.coalong.chapter04.ex02;

public class AttackPower {
    static final int MIN = 0;
    final int value; // final 로 불변으로 만들었습니다.

    AttackPower(int value) {
        if (value < MIN) {
            throw new IllegalArgumentException();
        }

        this.value = value;
    }

    /**
     * 공격력 강화하기
     * @param increment 공격력 증가량
     * @return 증가된 공격력
     */
    AttackPower reinforce(final AttackPower increment) {
        return new AttackPower(this.value + increment.value);
    }

    /**
     * 무력화하기
     */
    AttackPower disable() {
        return new AttackPower(MIN);
    }
}
