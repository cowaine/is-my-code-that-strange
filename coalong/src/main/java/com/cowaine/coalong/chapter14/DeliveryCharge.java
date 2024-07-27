package com.cowaine.coalong.chapter14;

import lombok.Getter;

@Getter
public class DeliveryCharge {
    private final int amount;
    private static final int CHARGE_FREE_THRESHOLD = 20000;
    private static final int PAY_CHARGE = 5000;
    private static final int CHARGE_FREE = 0;

    /**
     * @param shoppingCart 장바구니
     */
    DeliveryCharge(final ShoppingCart shoppingCart) {
        amount = (shoppingCart.totalPrice() < CHARGE_FREE_THRESHOLD) ? PAY_CHARGE : CHARGE_FREE;
    }
}
