package com.cowaine.coalong.chapter14;

import java.util.List;

/**
 * 배송 관리 클래스
 */
public class DeliveryManager {

    /**
     * 배송비를 리턴함.
     *
     * @param shoppingCart 배송 대상 상품 리스트
     * @return 배송비
     */
    public static int deliveryCharge(ShoppingCart shoppingCart) {
        int charge = 0;
        if (shoppingCart.totalPrice() < 20000) {
            charge = 5000;
        } else {
            charge = 0;
        }
        return charge;
    }
}
