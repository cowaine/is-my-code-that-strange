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

    int costMagicPoint(MagicType magicType, Member member) {
        int magicPoint = 0;

        switch (magicType) {
            case fire:
                magicPoint = 2;
                break;
            case lighting:
                magicPoint = 5 + (int) (member.level * 0.2);
                break;
        }
        return magicPoint;
    }

    int attackPower(MagicType magicType, Member member) {
        int attackPower = 0;
        switch (magicType) {
            case fire:
                attackPower = 20 + (int) (member.level * 0.5);
                break;
            case lighting:
                attackPower = 50 + (int) (member.agility * 1.5);
                break;
        }
        return attackPower;
    }
}
