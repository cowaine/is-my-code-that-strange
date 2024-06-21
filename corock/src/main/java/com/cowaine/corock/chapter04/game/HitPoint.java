package com.cowaine.corock.chapter04.game;

public class HitPoint {

    private static final int MIN = 0;

    int amount;

    public HitPoint(final int amount) {
        if (amount < MIN) {
            throw new IllegalArgumentException(MIN + " 이상을 지정해 주세요.");
        }

        this.amount = amount;
    }

    /**
     * 대미지를 받는다.
     *
     * @param damageAmount 대미지 크기
     */
    public void damage(final int damageAmount) {
        final int nextAmount = amount - damageAmount;
        amount = Math.max(MIN, nextAmount);
    }

    public boolean isZero() {
        return amount == 0;
    }

}
