package com.cowaine.coalong.chpater10;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Order {
    private final OrderId id;
    private final Items items;
    private GiftPoint giftPoint;

    int itemCount() {
        int count = items.getCount();

        // 주문 상품수가 10 이상일 때, 기프트 포인트를 100만큼 추가
        if (10 <= count) {
            giftPoint = giftPoint.add(new GiftPoint(100));
        }
        return count;
    }
}
