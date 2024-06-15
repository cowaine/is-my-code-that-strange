package com.cowaine.coalong.chapter01.rpggame;

public class RpgPlay {

    void canMagic(Member member, Magic magic) {
        // 살아 있는지 판정
        if (0 < member.hitPoint) {
            // 움직일 수 있는지 판정
            if (member.canAct()) {
                // 매직포인트에 여유가 있는지 판정
                if (magic.costMagicPoint <= member.magicPoint) {
                    member.consumeMagicPoint(magic.costMagicPoint);
                    member.chane(magic);
                }
            }
        }
    }

}
