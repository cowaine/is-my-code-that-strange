package com.cowaine.sunset0.chapter8.composition;



// 8.9 격쿠기의 물리 공격 클래스 (컴포지션)
public class FightPhysicalAttack {

    private final PhysicalAttack physicalAttack = new PhysicalAttack(); //컴포지션

    int singleAttackDamage() {
        return physicalAttack.singleAttackDamage() + 10;
    }

    int doubleAttackDamage() {
        return physicalAttack.doubleAttackDamage() + 10;
    }


}
