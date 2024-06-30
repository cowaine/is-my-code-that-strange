package com.cowaine.corock.chapter08.discount;

// 할인을 위한 슈퍼 클래스
public abstract class DiscountBase {

    // (...)

    // 원래 가격
    protected int price;

    // 할인 가격 반환
    int getDiscountPrice() {
        int discountedPrice = price - 3000;
        if (discountedPrice < 0) {
            discountedPrice = 0;
        }
        return discountedPrice;
    }

    // 할인 금액
    protected int discountCharge() {
        return 3000;
    }

}
