package com.cowaine.corock.chapter05.game;

/**
 * 장비하고 있는 방어구 목록이다.
 */
public class Equipments {

    private boolean canChange;
    private Equipment head;
    private Equipment armor;
    private Equipment arm;

    /**
     * 갑옷을 장착한다.
     *
     * @param newArmor 입을 갑옷
     */
    void equipArmor(final Equipment newArmor) {
        if (canChange) {
            this.armor = newArmor;
        }
    }

    /**
     * 전체 장비를 해제한다.
     */
    void deactivateAll() {
        this.head = Equipment.EMPTY;
        this.armor = Equipment.EMPTY;
        this.arm = Equipment.EMPTY;
    }

}
