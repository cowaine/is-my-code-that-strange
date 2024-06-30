package com.cowaine.corock.chapter06.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class MagicPointDamage implements Damage {

    private final Member member;

    @Override
    public void execute(int damageAmount) {
        member.setMagicPoint(member.getMagicPoint() - damageAmount);
        if (0 < member.getMagicPoint()) {
            return;
        }

        member.setMagicPoint(0);
    }

}
