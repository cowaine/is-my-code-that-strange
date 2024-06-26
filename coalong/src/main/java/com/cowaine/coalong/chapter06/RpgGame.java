package com.cowaine.coalong.chapter06;

public class RpgGame {
    void enableMagic(Member member, Magic magic) {
        // 살아 있는가
        if (0 < member.hitPoint) {
            // 움직일 수 있는가
            if (member.canAct()) {
                // 매직포인트가 남아 있는가
                if (magic.costMaicPoint <= member.magicPoint) {
                    member.consumeMagicPoint(magic.costMaicPoint);
                    member.chant(magic);
                }
            }
        }
    }
}
