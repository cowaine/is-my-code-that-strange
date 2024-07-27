package com.cowaine.corock.chapter14.shipping;

import lombok.Getter;

@Getter
public class DeliveryCharge {

    private int amount;

    DeliveryCharge(final ShoppingCart shoppingCart) {
        int totalPrice = shoppingCart.getProducts().get(0).getPrice() + shoppingCart.getProducts().get(1).getPrice();
        if (totalPrice < 20_000) {
            this.amount = 5000;
        } else {
            this.amount = 0;
        }
    }

}
