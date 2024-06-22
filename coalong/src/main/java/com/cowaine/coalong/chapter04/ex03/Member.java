package com.cowaine.coalong.chapter04.ex03;

public class Member {
    final HitPoint hitPoint;
    final States states;

    public Member(HitPoint hitPoint, States states) {
        this.hitPoint = hitPoint;
        this.states = states;
    }

    /**
     * 대미지 받는 처리
     * @param damageAmount 대미지 크기
     */
    void damage(final int damageAmount) {
        hitPoint.damage(damageAmount);
        if (hitPoint.isZero()) {
            states.add(StateType.DEAD);
        }
    }
}
