package com.cowaine.sunset0.chapter6.if_overlap;

public class Game {

    //6.1 if 조건문을 중첩해서 구현한 예
    void magic(Member member, Magic magic) {
        if (0 < member.hitPoint) {
            if (member.canAct()) {
                if (magic.costMagicPoint <= member.magicPoint) {
                    member.consumeMagicPoint(magic.costMagicPoint);
                    member.chant(magic);
                }
            }
        }
    }

    //6.4 조기리턴으로 모든 중첩 제거하기
    void magicV2(Member member, Magic magic) {
        if (member.hitPoint <=0) return;
        if(!member.canAct()) return;
        if(member.magicPoint < magic.costMagicPoint) return;

        member.consumeMagicPoint(magic.costMagicPoint);
        member.chant(magic);
    }




}
