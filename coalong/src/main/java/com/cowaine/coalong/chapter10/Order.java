package com.cowaine.coalong.chapter10;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Order {
    private final OrderId id;
    private final Items items;
    private GiftPoint giftPoint;

    int itemCount() {
        return items.getCount();
    }

    boolean shouldAddGiftPoint() {
        return 10 <= itemCount();
    }

    void tryAddGiftPoint() {
        if (shouldAddGiftPoint()) {
            giftPoint = giftPoint.add(new GiftPoint(100));
        }
    }
}
