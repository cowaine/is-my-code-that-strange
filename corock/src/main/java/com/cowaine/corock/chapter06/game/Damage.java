package com.cowaine.corock.chapter06.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Damage {

    private final Member member;

    public void damage(boolean damageFlag, int damageAmount) {
        if (damageFlag == true) {
            // 물리 대미지(히트 포인트 기반 대미지)
            member.setHitPoint(member.getHitPoint() - damageAmount);
            if (0 < member.getHitPoint()) {
                return;
            }

            member.setHitPoint(0);
            member.addState(StateType.DEAD);
        } else {
            // 마법 대미지(매직 포인트 기반 대미지)
            member.setMagicPoint(member.getMagicPoint() - damageAmount);
            if (0 < member.getMagicPoint()) {
                return;
            }

            member.setMagicPoint(0);
        }
    }

}
