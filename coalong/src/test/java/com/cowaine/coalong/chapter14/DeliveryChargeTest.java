package com.cowaine.coalong.chapter14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeliveryChargeTest {

    // 상품 합계 금액이 20,000 미만이면, 배송비는 5,000원입니다.
    @Test
    void payCharge() {
        ShoppingCart emptyCart = new ShoppingCart();
        ShoppingCart oneProductAdded = emptyCart.add(new Product(1, "상품A", 5000));
        ShoppingCart twoProductAdded = oneProductAdded.add(new Product(2, "상품B", 14990));
        DeliveryCharge charge = new DeliveryCharge(twoProductAdded);

        assertEquals(5000, charge.getAmount());
    }

    // 상품 합계 금액이 20,000원 이상이면, 배송비는 무료입니다.
    @Test
    void chargeFree() {
        ShoppingCart emptyCart = new ShoppingCart();
        ShoppingCart oneProductAdded = emptyCart.add(new Product(1, "상품A", 5000));
        ShoppingCart twoProductAdded = oneProductAdded.add(new Product(2, "상품B", 15000));
        DeliveryCharge charge = new DeliveryCharge(twoProductAdded);

        assertEquals(0, charge.getAmount());
    }
}
