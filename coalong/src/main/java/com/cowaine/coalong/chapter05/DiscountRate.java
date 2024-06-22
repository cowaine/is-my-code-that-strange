package com.cowaine.coalong.chapter05;

public class DiscountRate {
    final float discountRate;

    public DiscountRate(float discountRate) {
        if(discountRate < 0) {
            throw new IllegalArgumentException();
        }
        this.discountRate = discountRate;
    }
}
