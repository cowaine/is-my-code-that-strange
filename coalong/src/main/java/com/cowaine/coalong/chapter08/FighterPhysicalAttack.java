package com.cowaine.coalong.chapter08;

public class FighterPhysicalAttack {
    private final PhysicalAttack physicalAttack;

    public FighterPhysicalAttack(PhysicalAttack physicalAttack) {
        this.physicalAttack = physicalAttack;
    }

    int singleAttackDamage() {
        return physicalAttack.singleAttackDamage() + 20;
    }

    int doubleAttackDamage() {
        return physicalAttack.doubleAttackDamage() + 10;
    }
}
