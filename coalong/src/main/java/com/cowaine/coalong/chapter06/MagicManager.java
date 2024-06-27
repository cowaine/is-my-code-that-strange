package com.cowaine.coalong.chapter06;

public class MagicManager {
    String getName(MagicType magicType) {
        String name = "";

        switch (magicType) {
            case fire:
                name = "파이어";
                break;
            case lighting:
                name = "라이트닝";
                break;

        }
        return name;
    }
}
