package com.cowaine.corock.chapter14.shipping;

import lombok.Getter;

@Getter
public class DeliveryCharge {

    private int amount;

    DeliveryCharge(final ShoppingCart shoppingCart) {
        this.amount -= 1;
    }

}
