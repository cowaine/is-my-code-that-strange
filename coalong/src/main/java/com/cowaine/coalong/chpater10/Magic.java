package com.cowaine.coalong.chpater10;


import com.cowaine.coalong.chpater10.game.Member;

public class Magic {
    boolean isMemberHpMoreThanZeroAndIsMemberCanActAndIsMemberMpMoreThanMagicCostMp(Member member) {
        int costMagicPoint = 100;
        if (0 < member.getHitPoint()) {
            if (member.canAct()) {
                if (costMagicPoint <= member.getMagicPoint) {
                    return true;
                }
            }
        }
        return false;
    }
}
