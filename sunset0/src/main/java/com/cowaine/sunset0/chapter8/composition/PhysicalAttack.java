package com.cowaine.sunset0.chapter8.composition;

//8.7 물리 공격 클래스
public class PhysicalAttack {

    int singleAttackDamage() {
        return 10;
    }

    int doubleAttackDamage() {

//        return 25;

        //만약 이렇게 변경된다면?
        return singleAttackDamage() * 2;
    }
}
