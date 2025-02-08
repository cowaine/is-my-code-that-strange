package com.cowaine.corock.chapter08.discount;

import lombok.Getter;

/**
 * 상품의 가격을 나타낸다.
 */
@Getter
public class RegularPrice {

    private static final int MIN_AMOUNT = 0;

    private final int amount;

    /**
     * @param amount 금액
     */
    RegularPrice(final int amount) {
        if (amount < MIN_AMOUNT) {
            throw new IllegalArgumentException("가격은 0 이상이어야 합니다.");
        }

        this.amount = amount;
    }

}
