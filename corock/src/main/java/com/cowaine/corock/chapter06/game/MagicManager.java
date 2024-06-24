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

}
