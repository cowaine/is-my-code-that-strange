package com.cowaine.corock.chapter10.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Magic {

    private final int costMagicPoint;

    public boolean isMemberHpMoreThanZeroAndIsMemberCanActAndIsMemberMpMoreThanMagicCostMp(Member member) {
        if (0 < member.getHitPoint()) {
            if (member.canAct()) {
                if (costMagicPoint <= member.getMagicPoint()) {
                    return true;
                }
            }
        }

        return false;
    }

}
