package com.cowaine.corock.chapter08.game;

public class FighterPhysicalAttack extends PhysicalAttack {

    @Override
    int singleAttackDamage() {
        return super.singleAttackDamage() + 20;
    }

    @Override
    int doubleAttackDamage() {
        return super.doubleAttackDamage() + 10;
    }

}
