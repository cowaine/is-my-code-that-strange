package com.cowaine.coalong.chapter08;

public class FigtherPhysicalAttack extends PhysicalAttack {
    @Override
    int singleAttackDamage() {
        return super.singleAttackDamage() + 20;
    }

    @Override
    int doubleAttackDamage() {
        return super.doubleAttackDamage() + 10;
    }
}
