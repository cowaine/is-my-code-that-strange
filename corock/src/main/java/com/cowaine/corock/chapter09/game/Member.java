package com.cowaine.corock.chapter09.game;

public class Member {

    private int level;

    private Equipment head;
    private Equipment body;
    private Equipment arm;
    private int defense;

    // (...)

    void init() {
        if (level > 99) {
            level = 99;
        }

        if (level == 1) {
            // 멤버의 히트 포인트와 장비 등을 초기화
            initHitPoint();
            initMagicPoint();
            initEquipments();
        } else if (level == 100) {
            // 레벨 100 보너스로 고유의 특별한 능력을 부여
            addSpecialAbility();
        }
    }

    private void initHitPoint() {
        // (...)
    }

    private void initMagicPoint() {
        // (...)
    }

    private void initEquipments() {
        // (...)
    }

    private void addSpecialAbility() {
        // (...)
    }

    // 방어구의 방어력과 캐릭터의 방어력을 합산해서 반환
    int totalDefense() {
        int total = defense;
        total += head.getDefense();
        total += body.getDefense();
        total += arm.getDefense();

        return total;
    }

}
