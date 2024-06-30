package com.cowaine.corock.chapter08.discount;

public class SummerDiscount extends DiscountBase {

    @Override
    int getDiscountPrice() {
        return (int) (price * (1.00 - 0.05));
    }

}
