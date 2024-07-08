package com.cowaine.snoopingh.chap08.composition;

public class FightPhysicalAttack extends PhysicalAttack {
    @Override
    int singleAttackDamage() {
        return super.singleAttackDamage() + 20;
    }

    @Override
    int doubleAttackDmanage() {
        return super.doubleAttackDmanage() + 10;
    }
}
