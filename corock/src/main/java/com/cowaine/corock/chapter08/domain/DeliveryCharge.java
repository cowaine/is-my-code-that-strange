package com.cowaine.corock.chapter08.domain;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor(access = AccessLevel.PACKAGE)
public class DeliveryCharge {

    private static final int DELIVERY_FREE_MIN = 20000;

    private final int amount;

    // 배송비 계산하기
    int calcDeliveryCharge() {
        return DELIVERY_FREE_MIN <= amount ? 0 : 5000;
    }

}
