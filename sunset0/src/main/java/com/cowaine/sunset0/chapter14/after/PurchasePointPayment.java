package com.cowaine.sunset0.chapter14.after;

import java.time.LocalDateTime;

public class PurchasePointPayment {
    final CustomerId customerId;
    final ComicId comicId;
    final PurchasePoint consumptionPoint;
    final LocalDateTime paymentDateTime;

    public PurchasePointPayment(final Coustomer customer, final Comic comic) throws IllegalAccessException {

        //조기 리턴
        if (!customer.isEnable()) {
            throw new IllegalAccessException("유효하지 않은 계정입니다.");
        }
        if (comic.isDisable()){
            throw new IllegalAccessException("현재 구매할 수 없는 만화입니다.");
        }
        if (customer.isShortOfPoint(comic)){
            throw new RuntimeException("보유하고 있는 포인트가 부족합니다.");
        }

        customerId = customer.id;
        comicId = comic.id;
        consumptionPoint = comic.currentPurchasePoint;
        paymentDateTime = LocalDateTime.now();

    }
}
