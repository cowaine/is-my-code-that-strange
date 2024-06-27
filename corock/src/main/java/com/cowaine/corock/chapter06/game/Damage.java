package com.cowaine.corock.chapter06.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Damage {

    private final Member member;

    public void hitPointDamage(int damageAmount) {
        member.setHitPoint(member.getHitPoint() - damageAmount);
        if (0 < member.getHitPoint()) {
            return;
        }

        member.setHitPoint(0);
        member.addState(StateType.DEAD);
    }

    public void magicPointDamage(int damageAmount) {
        member.setMagicPoint(member.getMagicPoint() - damageAmount);
        if (0 < member.getMagicPoint()) {
            return;
        }

        member.setMagicPoint(0);
    }

}
