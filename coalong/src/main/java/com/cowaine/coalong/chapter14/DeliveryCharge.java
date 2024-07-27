package com.cowaine.coalong.chapter14;

import lombok.Getter;

@Getter
public class DeliveryCharge {
    private final int amount;

    DeliveryCharge(final ShoppingCart shoppingCart) {
        if (shoppingCart.totalPrice() < 20000) {
            amount = 5000;
        } else {
            amount = 0;
        }
    }
}
