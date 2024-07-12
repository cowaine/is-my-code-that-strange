package com.cowaine.coalong.chapter09;

import com.cowaine.coalong.chapter05.game.Equipment;

public class Member {
    private Equipment head;
    private Equipment body;
    private Equipment arm;
    private int defense;

    // 방어구의 방어력과 캐릭터의 방어력을 합산해서 리턴
    int totalDefense() {
        int total = defense;
        total += head.getDefence();
        total += body.getDefence();
        total += arm.getDefence();
        return total;
    }
}
