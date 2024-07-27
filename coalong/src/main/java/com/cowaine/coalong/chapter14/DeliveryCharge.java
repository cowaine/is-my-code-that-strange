package com.cowaine.coalong.chapter14;

import lombok.Getter;

@Getter
public class DeliveryCharge {
    private final int amount;

    DeliveryCharge(final ShoppingCart shoppingCart) {
        int totalPrice = shoppingCart.products.get(0).getPrice() + shoppingCart.products.get(1).getPrice();

        if (totalPrice < 20000) {
            amount = 5000;
        } else {
            amount = 0;
        }
    }
}
