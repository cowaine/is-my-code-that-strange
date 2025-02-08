package com.cowaine.corock.chapter05.domain;

/**
 * 정가 클래스다.
 */
public class RegularPrice {

    final int amount;

    /**
     * @param amount 금액
     */
    RegularPrice(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }
        this.amount = amount;
    }

}
