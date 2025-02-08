package com.cowaine.corock.chapter08.game;

public class PhysicalAttack {

    // 단일 공격 대미지 반환
    public int singleAttackDamage() {
        return 0;
    }

    // 2회 공격 대미지 반환
    public int doubleAttackDamage() {
        return this.singleAttackDamage() + this.singleAttackDamage();
    }

}
