package com.cowaine.snoopingh.chap04;

public class Main {
    public static void main(String[] args) {
        AttackPower attackPowerA = new AttackPower(20);
        AttackPower attackPowerB = new AttackPower(20);

        Weapon weaponA = new Weapon(attackPowerA);
        Weapon weaponB = new Weapon(attackPowerB);

        weaponA.attackPower.value += 5;
    }
}
