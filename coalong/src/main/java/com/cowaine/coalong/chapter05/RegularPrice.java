package com.cowaine.coalong.chapter05;

/**
 * 정가
 */
public class RegularPrice {
    final int amount;

    /**
     * @param amount 금액
     */
    public RegularPrice(final int amount) {
        if(amount < 0) {
            throw new IllegalArgumentException();
        }
        this.amount = amount;
    }
}
