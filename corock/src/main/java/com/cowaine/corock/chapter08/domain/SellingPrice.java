package com.cowaine.corock.chapter08.domain;

class SellingPrice {

    private static final float SELLING_COMMISSION_RATE = 0.05f;
    private static final int DELIVERY_FREE_MIN = 20000;
    private static final float SHOPPING_POINT_RATE = 0.01f;

    private final int amount;

    SellingPrice(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("가격은 0 이상이어야 합니다.");
        }
        this.amount = amount;
    }

    // 판매 수수료 계산하기
    int calcSellingCommission() {
        return (int) (amount * SELLING_COMMISSION_RATE);
    }

    // 배송비 계산하기
    int calcDeliveryCharge() {
        return DELIVERY_FREE_MIN <= amount ? 0 : 5000;
    }

    // 추가할 쇼핑 포인트 계산하기
    int calcShoppingPoint() {
        return (int) (amount * SHOPPING_POINT_RATE);
    }

}
