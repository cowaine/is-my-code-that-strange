package com.cowaine.coalong.chapter06;

public class RpgGame {
    void enableMagic(Member member, Magic magic) {
        // 살아 있지 않은 경우 리턴하므로 처리를 종료합니다.
        // 조기 리턴으로 변경하기 위해 조건을 반전했습니다.
        if (member.hitPoint <= 0) return;
        if (!member.canAct()) return;
        if (member.magicPoint < magic.costMaicPoint) return;

        member.consumeMagicPoint(magic.costMaicPoint);
        member.chant(magic);
    }
}
