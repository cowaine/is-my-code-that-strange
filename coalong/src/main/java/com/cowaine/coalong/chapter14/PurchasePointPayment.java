package com.cowaine.coalong.chapter14;


import java.time.LocalDateTime;

public class PurchasePointPayment {
    final CustomerId customerId;   // 구매자의 ID
    final ComicId comicId;         // 구매할 웹툰의 ID
    final PurchasePoint consumptionPoint; // 구매에 필요한 포인트
    final LocalDateTime paymentDateTime;  // 구매 일자

    PurchasePointPayment(final Customer customer, final Comic comic) {
        if (customer.isEnabled()) {
            throw new IllegalArgumentException("유효하지 않은 계정입니다.");
        }
        customerId = customer.getId();
        if (!comic.isEnabled()) {
            throw new IllegalArgumentException("현재 구매할 수 없는 만화입니다.");
        }
        comicId = comic.getId();
        if (customer.getPossessionPoint().getAmount() < comic.getCurrentPurchasePoint().getAmount()) {
            throw new RuntimeException("보유하고 있는 포인트가 부족합니다.");
        }
        consumptionPoint = customer.getPossessionPoint();
        paymentDateTime = LocalDateTime.now();
    }
}
