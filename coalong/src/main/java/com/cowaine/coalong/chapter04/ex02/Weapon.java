package com.cowaine.coalong.chapter04.ex02;

public class Weapon {
    final AttackPower attackPower;

    Weapon(AttackPower attackPower) {
        this.attackPower = attackPower;
    }

    /**
     * 무기 강화하기
     * @param increment 공격력 강화
     * @return 강화된 무기
     */
    Weapon reinforce(final AttackPower increment) {
        final AttackPower reinforced = attackPower.reinforce(increment);
        return new Weapon(reinforced);
    }
}
