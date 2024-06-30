package com.cowaine.corock.chapter08.game;

public class FighterPhysicalAttack extends PhysicalAttack {

    @Override
    public int singleAttackDamage() {
        return super.singleAttackDamage() + 20;
    }

    @Override
    public int doubleAttackDamage() {
        return super.doubleAttackDamage() + 10;
    }

}
