package com.cowaine.coalong.chapter10;


import com.cowaine.coalong.chapter10.game.Member;

public class Magic {
    boolean canEnchant(final Member member) {
        int costMagicPoint = 100;
        if (member.getHitPoint() <= 0) return false;
        if (!member.canAct()) return false;
        if (member.getMagicPoint < costMagicPoint) return false;

        return true;
    }
}
