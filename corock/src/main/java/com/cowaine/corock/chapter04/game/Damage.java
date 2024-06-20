package com.cowaine.corock.chapter04.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Damage {

    private final Member member;
    private final Enemy enemy;

    public int damage() {
        final int basicAttackPower = member.power() + member.weaponAttack();
        final int finalAttackPower = (int) (basicAttackPower * (1f + member.speed() / 100f));
        final int reduction = (int) (enemy.getDefense() / 2);

        return Math.max(0, finalAttackPower - reduction);
    }

}
