package com.cowaine.coalong.chapter04.ex02;

public class AttackGame {
    public static void main(String[] args) {
        Attack();
    }
    static void Attack() {
        AttackPower attackPower = new AttackPower(20);

        Weapon weaponA = new Weapon(attackPower);
        Weapon weaponB = new Weapon(attackPower);

        weaponA.attackPower.value = 25;

        System.out.println("Weapon A attack power : " + weaponA.attackPower.value);
        System.out.println("Weapon B attack power : " + weaponB.attackPower.value);
    }
}
