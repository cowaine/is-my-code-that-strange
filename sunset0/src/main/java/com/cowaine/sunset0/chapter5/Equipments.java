package com.cowaine.sunset0.chapter5;

public class Equipments {

    private static final Equipments EMPTY = new Equipments();
    private boolean canChange = true;
    private Equipments head;
    private Equipments armor;
    private Equipments arm;

    void equipArmor(final Equipments newArmor) {
        if (canChange) {
            armor = newArmor;
        }
    }

    void deactivateAll() {
        head = Equipments.EMPTY;
        armor = Equipments.EMPTY;
        arm = Equipments.EMPTY;
    }
}
