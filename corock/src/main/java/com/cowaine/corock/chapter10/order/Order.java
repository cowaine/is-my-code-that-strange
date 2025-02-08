package com.cowaine.corock.chapter10.order;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class Order {

    private final OrderId id;
    private final Items items;
    private GiftPoint giftPoint;

    public int itemCount() {
        int count = items.count();

        // 주문 상품 수가 10 이상일 때, 기프트 포인트를 100 만큼 추가
        if (10 <= count) {
            giftPoint = giftPoint.add(new GiftPoint(100));
        }

        return count;
    }

}
