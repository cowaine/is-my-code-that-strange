package com.cowaine.corock.chapter06.game;

import lombok.Getter;

@Getter
public class Magic {

    private final String name;
    private final int costMagicPoint;
    private final int attackPower;
    private final int costTechnicalPoint;

    public Magic(final MagicType magicType, final Member member) {
        switch (magicType) {
            case FIRE:
                name = "파이어";
                costMagicPoint = 2;
                attackPower = 20 + (int) (member.getLevel() * 0.5);
                costTechnicalPoint = 0;
                break;
            case LIGHTNING:
                name = "라이트닝";
                costMagicPoint = 5 + (int) (member.getLevel() * 0.2);
                attackPower = 50 + (int) (member.getAgility() * 1.5);
                costTechnicalPoint = 5;
                break;
            case HELL_FIRE:
                name = "헬파이어";
                costMagicPoint = 16;
                attackPower = 200 + (int) (member.getMagicAttack() * 0.5 + member.getVitality() * 2);
                costTechnicalPoint = 20 + (int) (member.getLevel() * 0.4);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }

}
