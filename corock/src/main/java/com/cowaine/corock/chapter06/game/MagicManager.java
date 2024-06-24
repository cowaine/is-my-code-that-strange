package com.cowaine.corock.chapter06.game;

public class MagicManager {

    public String getName(MagicType magicType) {
        String name = "";

        switch (magicType) {
            case FIRE:
                name = "파이어";
                break;
            case LIGHTING:
                name = "라이트닝";
                break;
        }

        return name;
    }

    public int costMagicPoint(MagicType magicType, Member member) {
        int magicPoint = 0;

        switch (magicType) {
            case FIRE:
                magicPoint = 2;
                break;
            case LIGHTING:
                magicPoint = 5 + (int) (member.getLevel() * 0.2);
                break;
        }

        return magicPoint;
    }

}
