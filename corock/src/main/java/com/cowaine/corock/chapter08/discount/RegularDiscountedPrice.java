package com.cowaine.corock.chapter08.discount;

/**
 * 일반 할인 가격 클래스다.
 */
public class RegularDiscountedPrice {

    private static final int MIN_AMOUNT = 0;
    private static final int DISCOUNT_AMOUNT = 4000;

    private final int amount;

    RegularDiscountedPrice(final RegularPrice price) {
        int discountedAmount = price.getAmount() - DISCOUNT_AMOUNT;
        if (discountedAmount < MIN_AMOUNT) {
            discountedAmount = MIN_AMOUNT;
        }

        this.amount = discountedAmount;
    }

}
