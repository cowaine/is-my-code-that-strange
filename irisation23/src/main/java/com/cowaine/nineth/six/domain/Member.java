package com.cowaine.nineth.six.domain;

public class Member {
    private Equipment head;
    private Equipment body;
    private Equipment arm;
    private int defence;

    // 생략

    // 방어구의 방어력과 캐릭터의 방어력을 합산해서 리턴
    int totalDefence() {
        int total = defence;

        if (head != null) {
            total += head.getDefencePoint();
        }

        if (body != null) {
            total += body.getDefencePoint();
        }

        if (arm != null) {
            total += arm.getDefencePoint();
        }

        return total;
    }

    // 모든 방어구 장비 해제
    void takeOffAllEquipments() {
        head = null;
        body = null;
        arm = null;
    }

    // 방어구 출력하기
    void showBodyEquipment() {
        if (body != null) {
            body.printValue();
        }
    }
}
