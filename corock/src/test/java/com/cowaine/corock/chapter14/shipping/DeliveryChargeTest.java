package com.cowaine.corock.chapter14.shipping;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DeliveryChargeTest {

    @DisplayName("상품 합계 금액이 20,000원 미만이면, 배송비는 5,000원입니다.")
    @Test
    void testPayCharge() {
        // Given
        ShoppingCart emptyCart = new ShoppingCart();
        ShoppingCart oneProductAdded = emptyCart.add(new Product(1, "상품 A", 5_000));
        ShoppingCart twoProductAdded = oneProductAdded.add(new Product(2, "상품 B", 14_990));

        // When
        DeliveryCharge charge = new DeliveryCharge(twoProductAdded);

        // Then
        assertEquals(5_000, charge.getAmount());
    }

    @DisplayName("상품 합계 금액이 20,000원 이상이면, 배송비는 무료입니다.")
    @Test
    void testChargeFree() {
        // Given
        ShoppingCart emptyCart = new ShoppingCart();
        ShoppingCart oneProductAdded = emptyCart.add(new Product(1, "상품 A", 5_000));
        ShoppingCart twoProductAdded = oneProductAdded.add(new Product(2, "상품 B", 15_000));

        // When
        DeliveryCharge charge = new DeliveryCharge(twoProductAdded);

        // Then
        assertEquals(0, charge.getAmount());
    }

}
