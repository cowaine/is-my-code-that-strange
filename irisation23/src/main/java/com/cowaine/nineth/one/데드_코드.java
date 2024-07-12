package com.cowaine.nineth.one;

public class 데드_코드 {
    public static void main(String[] args) {
        int level = 0;

        if (level > 99) {
            level = 99;
        }

        // 생략

        if (level == 1) {
            // 멤버의 히트 포인트와 장비 등을 초기화
            initHp();
            initMp();
            initEquipments();
        } else if (level == 100) {
            // 레벨 100 보너스로
            // 고유의 특별한 능력을 부여
            addSpecialAbility();
        }
    }

    private static void initHp() {
    }

    private static void initMp() {
    }

    private static void initEquipments() {
    }

    private static void addSpecialAbility() {

    }
}
