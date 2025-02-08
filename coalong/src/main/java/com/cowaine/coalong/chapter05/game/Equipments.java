package com.cowaine.coalong.chapter05.game;

public class Equipments {
    private boolean canChange;
    private Equipment head;
    private Equipment armor;
    private Equipment arm;

    /**
     * 갑옷 장비하기
     * @param newArmor 장비할 갑옷
     */
    void equipAmor(final Equipment newArmor) {
        if (canChange) {
            armor = newArmor;
        }
    }

    /**
     * 전체 장비 해제하기
     */
    void deactivateAll() {
        head = Equipment.EMPTY;
        armor = Equipment.EMPTY;
        arm = Equipment.EMPTY;
    }
}
