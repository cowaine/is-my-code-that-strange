package com.cowaine.corock.chapter04.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Member {

    private final HitPoint hitPoint;
    private final States states;

    public int power() {
        return 65;
    }

    public int weaponAttack() {
        return 20;
    }

    public float speed() {
        return 15;
    }

    /**
     * 대미지를 받는다.
     *
     * @param damageAmount 대미지 크기
     */
    public void damage(int damageAmount) {
        hitPoint.amount -= damageAmount;
    }

}
