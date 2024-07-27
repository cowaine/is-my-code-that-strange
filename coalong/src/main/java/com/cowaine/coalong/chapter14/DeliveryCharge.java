package com.cowaine.coalong.chapter14;

import lombok.Getter;

@Getter
public class DeliveryCharge {
    private final int amount;
    private static final int CHARGE_FREE_THRESHOLD = 20000;
    private static final int PAY_CHARGE = 5000;
    private static final int CHARGE_FREE = 0;

    DeliveryCharge(final ShoppingCart shoppingCart) {
        if (shoppingCart.totalPrice() < CHARGE_FREE_THRESHOLD) {
            amount = PAY_CHARGE;
        } else {
            amount = CHARGE_FREE;
        }
    }
}
