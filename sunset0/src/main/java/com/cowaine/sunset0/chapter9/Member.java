package com.cowaine.sunset0.chapter9;

//9.6 방어구와 방어력을 표현하는 로직 일부
public class Member {
    private Equipment head;
    private Equipment body;
    private Equipment arm;
    private int defence;

    //방어구의 방어력과 캐릭터의 방어력을 합산해서 리턴
    int totalDefence() {
        int total = defence;
        total += head.defence; //NPE 가능성 있음
        total += body.defence; //NPE 가능성 있음
        total += arm.defence; //NPE 가능성 있음
        return total;
    }

    void takeOffAllEquipments() {
        head = null;
        body = null;
        arm = null;
    }

}
