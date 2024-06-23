package com.cowaine.sunset0.chapter6.switch_overlap;

import com.cowaine.sunset0.chapter6.if_overlap.Member;

public class MagicManager {

    //6.11 switch 조건문으로 표시 이름 지정
    String getName(MagicType magicType) {
        String name = "";

        switch (magicType) {
            case fire:
                name = "파이어";
                break;
            case lightning:
                name = "라이트닝";
                break;
        }
        return name;
    }

    //6.12 switch 조건문으로 매직포인트 소비량 지정
    int costMagicPoint(MagicType magicType, Member member) {
        int magicPoint = 0;
        switch (magicType) {
            case fire:
                magicPoint = 2;
                break;
            case lightning:
                magicPoint = 5 + (int) (member.level * 0.2);
                break;
        }
        return magicPoint;

    }
}
