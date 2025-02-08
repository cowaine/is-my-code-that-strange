package com.cowaine.snoopingh.chap09;

public class Member {
    private Equipment head;
    private Equipment body;
    private Equipment arm;
    private int defence;

    // 방어구의 방어력과 캐릭터의 방어력을 합산해서 리턴
    int totalDefence() {
        int total = defence;
        total += head.defence;
        total += body.defence;
        total += arm.defence;
        return total;
    }

    // 모든 방어구 장비 해제
    void takeOffAllEquipments() {
        head = Equipment.EMPTY;
        body = Equipment.EMPTY;
        arm = Equipment.EMPTY;
    }
}
