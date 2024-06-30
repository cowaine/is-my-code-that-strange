package com.cowaine.corock.chapter08.discount;

// 할인을 위한 슈퍼 클래스
public abstract class DiscountBase {

    // (...)

    // 원래 가격
    protected int price;

    // 할인 가격 반환
    int getDiscountPrice() {
        if (this instanceof RegularDiscount) {
            int discountedPrice = price - 4000;
            if (discountedPrice < 0) {
                discountedPrice = 0;
            }
            return discountedPrice;
        } else if (this instanceof SummerDiscount) {
            return (int) (price * (1.00 - 0.05));
        }

        throw new RuntimeException();
    }

    // 할인 금액
    protected int discountCharge() {
        return 3000;
    }

}
