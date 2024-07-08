package com.cowaine.sunset0.chapter8.single_responsibility_class;

//8.5 일반 할인 클래스
public class RegularDiscountPrice {

    private static final int MIN_AMOUNT = 0;
    private static final int DISCOUNT_AMOUNT = 4000;
    final int amount;

    public RegularDiscountPrice(final RegularPrice price) {
        int discountedAmount = price.amount = DISCOUNT_AMOUNT;
        if (discountedAmount < MIN_AMOUNT) {
            discountedAmount = MIN_AMOUNT;
        }

        amount = discountedAmount;
    }
}
