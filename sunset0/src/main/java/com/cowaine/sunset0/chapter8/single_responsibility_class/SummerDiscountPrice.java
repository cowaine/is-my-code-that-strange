package com.cowaine.sunset0.chapter8.single_responsibility_class;

public class SummerDiscountPrice {
    private static final int MIN_AMOUNT = 0;
    private static final int DISCOUNT_AMOUNT = 3000;
    final int amount;

    public SummerDiscountPrice(final RegularPrice price) {
        int discountedAmount = price.amount = DISCOUNT_AMOUNT;
        if (discountedAmount < MIN_AMOUNT) {
            discountedAmount = MIN_AMOUNT;
        }
        amount = discountedAmount;
    }
}
