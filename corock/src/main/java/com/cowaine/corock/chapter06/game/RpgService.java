package com.cowaine.corock.chapter06.game;

public class RpgService {

    /**
     * @implSpec 멤버가 테크니컬포인트(TP)를 가지며, 마법 발동에는 일정량의 테크니컬포인트가 필요함
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

        // 새로 추가함
        if (member.getTechnicalPoint() < magic.getCostTechnicalPoint()) {
            return;
        }

        member.consumeMagicPoint(magic.getCostMagicPoint());
        member.chant(magic);
    }

}
