package com.cowaine.snoopingh.chap10;

public class Order {
    private final OrderId id;
    private final Items items;
    private GiftPoint giftPoint;

    public Order(OrderId id, Items items) {
        this.id = id;
        this.items = items;
    }

    // 놀람 최소의 원칙 : 사용자가 예상하지 못한 놀라움을 최소화하도록 설계해야 한다는 접근 방법
//    int itemCount() {
//        int count = items.count();
//
//        if (10 <= count) {
//            giftPoint = giftPoint.add(new GiftPoint(100));
//        }
//
//        return count;
//    }


    // 로직의 의도와 이름 일치시키기 START
    int itemCount() {
        return items.count();
    }

    boolean shouldAddGiftPoint() {
        return 10 <= itemCount();
    }

    void tryAddGiftPoint() {
        if (shouldAddGiftPoint()) {
            giftPoint = giftPoint.add(new GiftPoint(100));
        }
    }
    // 로직의 의도와 이름 일치시키기 END
}
