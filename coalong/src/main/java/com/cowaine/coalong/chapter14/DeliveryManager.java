package com.cowaine.coalong.chapter14;

import java.util.List;

/**
 * 배송 관리 클래스
 */
public class DeliveryManager {

    /**
     * 배송비를 리턴함.
     *
     * @param products 배송 대상 상품 리스트
     * @return 배송비
     */
    public static int deliveryCharge(List<Product> products) {
        int charge = 0;
        int totalPrice = 0;
        for (Product each : products) {
            totalPrice += each.getPrice();
        }
        if (totalPrice < 20000) {
            charge = 5000;
        } else {
            charge = 0;
        }
        return charge;
    }
}
