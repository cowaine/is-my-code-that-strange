package com.cowaine.coalong.chapter08;

// 할인을 위한 슈퍼 클래스
public abstract class DiscountBase {
    protected int price; // 원래 가격

    // 할인 가격 리턴
    int getDiscountedPrice() {
        int discountedPrice = price - 3000;
        if (discountedPrice < 0) {
            discountedPrice = 0;
        }
        return discountedPrice;
    }
}
