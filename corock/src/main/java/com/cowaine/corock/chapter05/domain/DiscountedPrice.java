package com.cowaine.corock.chapter05.domain;

/**
 * 할인 요금 클래스다.
 */
public class DiscountedPrice {

    final int amount;

    /**
     * 정가와 할인율을 적용해서 할인가를 생성한다.
     *
     * @param regularPrice 정가
     * @param discountRate 할인율
     */
    public DiscountedPrice(final RegularPrice regularPrice, final DiscountRate discountRate) {
        // 정가와 할인율을 사용해서 계산
        this.amount = (int) (regularPrice.amount * discountRate.discountRate);
    }

}
