package com.cowaine.coalong.chapter05;

/**
 * 할인 요금
 */
public class DiscountedPrice {
    final int amount;

    /**
     * @param regularPrice 정가
     * @param discountRate 할인율
     */
    DiscountedPrice(final RegularPrice regularPrice,
                    final DiscountRate discountRate) {
        this.amount = (int) (regularPrice.amount * discountRate.discountRate);
    }
}
