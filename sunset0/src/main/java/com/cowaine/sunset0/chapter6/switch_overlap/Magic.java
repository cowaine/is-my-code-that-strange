package com.cowaine.sunset0.chapter6.switch_overlap;

import com.cowaine.sunset0.chapter6.if_overlap.Member;

//6.18 switch 조건문 한 번에 작성하기
public class Magic {

    final String name;
    final int costMagicPoint;
    final int attackPower;
    final int costTechnicalPoint;

    public Magic(final MagicType magicType, final Member member) {
        switch (magicType) {
            case fire:
                name = "파이어";
                costMagicPoint = 2;
                attackPower = 20 + (int) (member.level * 0.5);
                costTechnicalPoint = 0;
                break;
            case lightning:
                name = "라이트닝";
                costMagicPoint = 5 + (int) (member.level * 0.2);
                attackPower = 50 + (int) (member.agility * 1.5);
                costTechnicalPoint = 5;
                break;
            case hellFire:
                name = "헬파이어";
                costMagicPoint = 16;
                attackPower = 200 + (int) (member.magicAttack * 0.5 + member.vitality * 2);
                costTechnicalPoint = 20 + (int) (member.level * 0.4);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
