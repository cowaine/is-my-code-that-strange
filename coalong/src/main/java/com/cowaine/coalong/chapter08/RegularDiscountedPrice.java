package com.cowaine.coalong.chapter08;

public class RegularDiscountedPrice {
    private static final int MIN_AMOUNT = 0;
    private static final int DISCOUNT_AMOUNT = 4000;
    final int amount;

    public RegularDiscountedPrice(final RegularPrice price) {
        int discountAmount = price.amount - DISCOUNT_AMOUNT;
        if (discountAmount < MIN_AMOUNT) {
            discountAmount = MIN_AMOUNT;
        }
        this.amount = discountAmount;
    }
}
