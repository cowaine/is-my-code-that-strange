package com.cowaine.sunset0.chapter14.before;

import java.time.LocalDateTime;

public class PurchasePointPayment {
    final CustomerId customerId;
    final ComicId comicId;
    final PurchasePoint consumptionPoint;
    final LocalDateTime paymentDateTime;

    public PurchasePointPayment(final Coustomer customer, final Comic comic) throws IllegalAccessException {
        if (customer.isEnable()) {
            customerId = customer.id;
            if (comic.isEnable()) {
                comicId = comic.id;
                if (comic.currentPurchasePoint.amount <= customer.possession.amount) {
                    consumptionPoint = comic.currentPurchasePoint;
                    paymentDateTime = LocalDateTime.now();
                } else {
                    throw new RuntimeException("보유하고 있는 포인트가 부족합니다.");
                }

            } else {
                throw new IllegalAccessException("현재 구매할 수 없는 만화입니다.");
            }

        } else {
            throw new IllegalAccessException("유효하지 않은 계정입니다.");
        }
    }
}
