package com.cowaine.snoopingh.chap04;

public class Weapon {
    final AttackPower attackPower;

    Weapon(AttackPower attackPower) {
        this.attackPower = attackPower;
    }

    Weapon reinforce(final AttackPower increment) {
        final AttackPower reinforced = attackPower.reinforce(increment);
        return new Weapon(reinforced);
    }
}
