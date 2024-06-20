package com.cowaine.coalong.chapter04.ex02;

public class AttackGame {
    public static void main(String[] args) {
        Attack();
    }
    static void Attack() {
        AttackPower attackPowerA = new AttackPower(20);
        AttackPower attackPowerB = new AttackPower(20);

        Weapon weaponA = new Weapon(attackPowerA);
        Weapon weaponB = new Weapon(attackPowerB);

        weaponA.attackPower.value += 5;

        System.out.println("Weapon A attack power : " + weaponA.attackPower.value);
        System.out.println("Weapon B attack power : " + weaponB.attackPower.value);
    }
}
