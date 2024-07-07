package com.cowaine.corock.chapter08.domain;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class ShoppingPoint {

    private static final float SHOPPING_POINT_RATE = 0.01f;

    private final int amount;

    // 추가할 쇼핑 포인트 계산하기
    int calcShoppingPoint() {
        return (int) (amount * SHOPPING_POINT_RATE);
    }

}
