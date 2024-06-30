package com.cowaine.corock.chapter08.discount;

/**
 * 여름 할인 가격 클래스다.
 */
public class SummerDiscountedPrice {

    private static final int MIN_AMOUNT = 0;
    private static final int DISCOUNT_AMOUNT = 3000;

    private final int amount;

    SummerDiscountedPrice(final RegularPrice price) {
        int discountedAmount = price.getAmount() - DISCOUNT_AMOUNT;
        if (discountedAmount < MIN_AMOUNT) {
            discountedAmount = MIN_AMOUNT;
        }

        this.amount = discountedAmount;
    }

}
