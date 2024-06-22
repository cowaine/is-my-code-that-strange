package com.cowaine.snoopingh.chap05;

/** 할인요금 */
public class DiscountedPrice {
    final int amount;

    /**
     * @param regularPrice 정가
     * @param discountRate 할인율
     */
    DiscountedPrice(final RegularPrice regularPrice, final DiscountRate discountRate) {
        this.amount = 0; // regularPrice와 discountRate를 이용하여 계산
    }
}
