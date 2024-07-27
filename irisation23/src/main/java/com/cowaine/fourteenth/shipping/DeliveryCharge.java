package com.cowaine.fourteenth.shipping;

import lombok.Getter;

@Getter
public class DeliveryCharge {

    private static final int CHARGE_FREE_THRESHOLD = 20000;
    private static final int PAY_CHARGE = 5000;
    private static final int CHARGE_FREE = 0;

    private final int amount;

    /**
     * @param shoppingCart 장바구니
     */
    DeliveryCharge(final ShoppingCart shoppingCart) {
        if (shoppingCart.totalPrice() < CHARGE_FREE_THRESHOLD) {
            this.amount = PAY_CHARGE;
        } else {
            this.amount = CHARGE_FREE;
        }
    }

}
