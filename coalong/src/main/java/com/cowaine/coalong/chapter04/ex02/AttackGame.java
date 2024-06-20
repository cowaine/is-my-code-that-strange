package com.cowaine.coalong.chapter04.ex02;

public class AttackGame {
    public static void main(String[] args) {
        attack();
        action();
    }
    static void attack() {
        AttackPower attackPowerA = new AttackPower(20);
        AttackPower attackPowerB = new AttackPower(20);

        Weapon weaponA = new Weapon(attackPowerA);
        Weapon weaponB = new Weapon(attackPowerB);

        final AttackPower increment = new AttackPower(5);
        final Weapon reinforcedWeaponA = weaponA.reinforce(increment);

        System.out.println("Weapon A attack power : " + reinforcedWeaponA.attackPower.value);
        System.out.println("Weapon B attack power : " + weaponB.attackPower.value);
    }

    static void action() {
        final AttackPower attackPower = new AttackPower(20);

        final AttackPower reinforced = attackPower.reinforce(new AttackPower(15));
        System.out.println("attack power : " + reinforced.value);
    }
}
