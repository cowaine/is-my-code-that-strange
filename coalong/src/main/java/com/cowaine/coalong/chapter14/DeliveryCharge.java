package com.cowaine.coalong.chapter14;

import lombok.Getter;

@Getter
public class DeliveryCharge {
    private final int amount;

    DeliveryCharge(final ShoppingCart shoppingCart) {
        amount = DeliveryManager.deliveryCharge(shoppingCart.products);
    }
}
