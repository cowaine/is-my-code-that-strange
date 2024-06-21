package com.cowaine.corock.chapter04.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Weapon {

    public final AttackPower attackPower;

    /**
     * 무기를 강화한다.
     *
     * @param increment 공격력 강화
     * @return 강화된 무기
     */
    public Weapon reinforce(final AttackPower increment) {
        final AttackPower reinforced = attackPower.reinforce(increment);
        return new Weapon(reinforced);
    }

}
