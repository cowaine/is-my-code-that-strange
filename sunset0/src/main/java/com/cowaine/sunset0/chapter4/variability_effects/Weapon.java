package com.cowaine.sunset0.chapter4.variability_effects;

// 4.7무기를 나타내는 클래스
public class Weapon {
    final AttackPower attackPower;

    public Weapon(AttackPower attackPower) {
        this.attackPower = attackPower;
    }


    public static void main(String[] args) throws IllegalAccessException {
        //4.8 Attack 인스턴스 재사용하기
        AttackPower attackPower = new AttackPower(20);
        Weapon weaponA = new Weapon(attackPower);
        Weapon weaponB = new Weapon(attackPower);

        //4.9 재사용하고 있는 공격력을 변경하면?
        //4.10 다른 무기의 공격력까지 변경된 상태
        weaponA.attackPower.value = 25;
        System.out.println("weaponA.attackPower.value = " + weaponA.attackPower.value);
        System.out.println("weaponB.attackPower.value = " + weaponB.attackPower.value);


        //4.11 공격력 인스턴스를 개별적으로 생성하기
        AttackPower attackPowerC = new AttackPower(20);
        AttackPower attackPowerD = new AttackPower(20);
        Weapon weaponC = new Weapon(attackPowerC);
        Weapon weaponD = new Weapon(attackPowerD);
        weaponC.attackPower.value += 5;
        System.out.println("weaponC.attackPower.value = " + weaponC.attackPower.value);
        System.out.println("weaponD.attackPower.value = " + weaponD.attackPower.value);

    }

}
