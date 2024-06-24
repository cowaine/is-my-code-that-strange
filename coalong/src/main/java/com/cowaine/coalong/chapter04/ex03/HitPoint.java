package com.cowaine.coalong.chapter04.ex03;

public class HitPoint {
    private static final int MIN = 0;
    int amount;

    HitPoint(final int amount) {
        if (amount < MIN) {
            throw new IllegalArgumentException();
        }
        this.amount = amount;
    }

    /**
     * 대미지 받는 처리
     *
     * @param damageAmount 대미지 크기
     */
    void damage(final int damageAmount) {
        final int nextAmount = amount - damageAmount;
        amount = Math.max(MIN, nextAmount);
    }

    /**
     * @return 히트포인트가 0이라면 true
     */
    boolean isZero() {
        return amount == MIN;
    }
}

