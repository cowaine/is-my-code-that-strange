package com.cowaine.corock.chapter08.discount;

public class RegularDiscount extends DiscountBase {

    @Override
    int getDiscountPrice() {
        int discountedPrice = price - 4000;
        if (discountedPrice < 0) {
            discountedPrice = 0;
        }
        return discountedPrice;
    }

    @Override
    protected int discountCharge() {
        return 4000;
    }

}
