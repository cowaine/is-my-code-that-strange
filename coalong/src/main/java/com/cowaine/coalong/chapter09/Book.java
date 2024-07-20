package com.cowaine.coalong.chapter09;

public class Book {
    void dead(int level) {
        if (level > 99) {
            level = 99;
        }
        // 생략
        if (level == 1) {
            // 멤버의 히트포인와 장비 등을 초기화
            initHitPoint();
            initMagicPoint();
            initEquipments();
        } else if (level == 100) {
            // 레벨 100 보너스로
            // 고유의 특별한 능력을 부여
            addSpecialAbility();
        }
    }

    private void addSpecialAbility() {
    }

    private void initEquipments() {
    }

    private void initMagicPoint() {
    }

    private void initHitPoint() {
    }
}
