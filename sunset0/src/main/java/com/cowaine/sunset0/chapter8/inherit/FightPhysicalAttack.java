package com.cowaine.sunset0.chapter8.inherit;


// 8.8 격쿠기의 물리 공격 클래스 (상속 버전)
public class FightPhysicalAttack extends PhysicalAttack {
    @Override
    int singleAttackDamage() {
        return super.singleAttackDamage() + 10;
    }

    @Override
    int doubleAttackDamage() {
        return super.doubleAttackDamage() + 10;
    }


    public static void main(String[] args) {
        PhysicalAttack physicalAttack = new FightPhysicalAttack();
        int damage = physicalAttack.doubleAttackDamage();
        System.out.println("damage = " + damage);
    }
}
