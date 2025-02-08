package com.cowaine.corock.chapter10.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Magic {

    private final int costMagicPoint;

    @Deprecated(forRemoval = true)
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

    public boolean canEnchant(final Member member) {
        if (member.getHitPoint() <= 0) {
            return false;
        }

        if (!member.canAct()) {
            return false;
        }

        if (member.getMagicPoint() < costMagicPoint) {
            return false;
        }

        return true;
    }

}
