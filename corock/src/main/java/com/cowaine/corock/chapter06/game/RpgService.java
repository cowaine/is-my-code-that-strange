package com.cowaine.corock.chapter06.game;

public class RpgService {

    /**
     * @implNote 조기 반환(early return)은 조건 로직과 실행 로직을 분리할 수 있다는 장점이 있다.
     */
    public void cast(Member member, Magic magic) {
        if (member.getHitPoint() <= 0) {
            return;
        }

        if (!member.canAct()) {
            return;
        }

        if (member.getMagicPoint() < magic.getCostMagicPoint()) {
            return;
        }

        member.consumeMagicPoint(magic.getCostMagicPoint());
        member.chant(magic);
    }

}
