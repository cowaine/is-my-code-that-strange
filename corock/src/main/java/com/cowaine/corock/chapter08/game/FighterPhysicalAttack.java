package com.cowaine.corock.chapter08.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class FighterPhysicalAttack extends PhysicalAttack {

    private final PhysicalAttack physicalAttack;

    @Override
    public int singleAttackDamage() {
        return physicalAttack.singleAttackDamage() + 20;
    }

    @Override
    public int doubleAttackDamage() {
        return physicalAttack.doubleAttackDamage() + 10;
    }

}
