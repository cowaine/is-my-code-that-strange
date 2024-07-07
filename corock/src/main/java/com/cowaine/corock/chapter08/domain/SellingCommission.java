package com.cowaine.corock.chapter08.domain;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class SellingCommission {

    private static final float SELLING_COMMISSION_RATE = 0.05f;

    private final int amount;

    // 판매 수수료 계산하기
    int calculate() {
        return (int) (amount * SELLING_COMMISSION_RATE);
    }

}
