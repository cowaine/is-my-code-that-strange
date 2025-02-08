package com.cowaine.corock.chapter04.product;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Product {

    private static final int MAX_TOTAL_PRICE = 100_000;

    private final int totalPrice;

    public int addPrice(final int productPrice) {
        final int increasedTotalPrice = totalPrice + productPrice;
        if (MAX_TOTAL_PRICE < increasedTotalPrice) {
            throw new IllegalArgumentException("구매 상한 금액을 넘었습니다.");
        }

        return increasedTotalPrice;
    }

}
