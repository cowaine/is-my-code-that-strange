package com.cowaine.corock.chapter05.domain;

public class DiscountRate {

    float discountRate;

    public DiscountRate(float discountRate) {
        if (discountRate < 0.0f) {
            throw new IllegalArgumentException();
        }
        this.discountRate = discountRate;
    }

}
