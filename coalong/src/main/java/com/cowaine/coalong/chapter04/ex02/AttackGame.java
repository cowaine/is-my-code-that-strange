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

        weaponA.attackPower.value += 5;

        System.out.println("Weapon A attack power : " + weaponA.attackPower.value);
        System.out.println("Weapon B attack power : " + weaponB.attackPower.value);
    }

    static void action() {
        AttackPower attackPower = new AttackPower(20);

        attackPower.reinforce(15);
        System.out.println("attack power : " + attackPower.value);
    }
}
