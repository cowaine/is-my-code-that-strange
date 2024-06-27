package com.cowaine.coalong.chapter06;

public class MagicManager {
    String name;
    int costMagicPoint;
    int attackPower;
    int costTechnicalPoint;

    MagicManager(final MagicType magicType, final Member member) {
        switch (magicType) {
            case fire:
                name = "파이어";
                costMagicPoint = 2;
                attackPower = (int) (20 + member.level * 0.5);
                costTechnicalPoint = 0;
                break;
            case lighting:
                name = "라이트닝";
                costMagicPoint = (int) (5 + member.level * 0.2);
                attackPower = (int) (50 + member.agility * 1.5);
                costTechnicalPoint = 5;
                break;
            case hellFire:
                name = "헬파이어";
                costMagicPoint = 16;
                attackPower = (int) (200 + member.magicAttack * 0.5 + member.vitality * 2));
                costTechnicalPoint = (int) (20 + member.level * 0.4);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
