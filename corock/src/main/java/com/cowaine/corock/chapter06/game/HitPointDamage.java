package com.cowaine.corock.chapter06.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HitPointDamage implements Damage {

    private final Member member;

    @Override
    public void execute(int damageAmount) {
        member.setHitPoint(member.getHitPoint() - damageAmount);
        if (0 < member.getHitPoint()) {
            return;
        }

        member.setHitPoint(0);
        member.addState(StateType.DEAD);
    }

}
