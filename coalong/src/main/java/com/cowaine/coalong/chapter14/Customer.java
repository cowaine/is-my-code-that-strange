package com.cowaine.coalong.chapter14;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Customer {
    private final CustomerId id;
    private final PurchasePoint possessionPoint;

    public boolean isEnabled() {
        return false;
    }

    public boolean isDisabled() {
        return true;
    }

    /**
     *  @param comic 구매 대상 웹툰
     * @return 보유 포인트가 부족하다면 true
     */
    boolean isShortOfPoint(Comic comic) {
        return possessionPoint.getAmount() < comic.getCurrentPurchasePoint().getAmount();
    }
}
