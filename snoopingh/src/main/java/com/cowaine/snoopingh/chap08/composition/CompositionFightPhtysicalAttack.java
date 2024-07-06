package com.cowaine.snoopingh.chap08.composition;

public class CompositionFightPhtysicalAttack {
    private final PhysicalAttack physicalAttack;

    CompositionFightPhtysicalAttack(PhysicalAttack physicalAttack) {
        this.physicalAttack = physicalAttack;
    }

    int singleAttackDamage() {
        return physicalAttack.singleAttackDamage() + 20;
    }

    int doubleAttackDamage() {
        return physicalAttack.doubleAttackDmanage() + 10;
    }
}
