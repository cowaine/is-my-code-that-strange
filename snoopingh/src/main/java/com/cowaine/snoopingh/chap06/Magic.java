package com.cowaine.snoopingh.chap06;

public class Magic {
    // switch 조건문 중복을 해소하려면, 단일 책임 선택의 원칙을 생각해야 함.

    final String name;
    final int costMagicPoint;
    final int attackPower;
    final int costTechnicalPoint;

    Magic(final MagicType magicType, final Member member) {
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
            default:
                throw new IllegalArgumentException();
        }
    }
}
