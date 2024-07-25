package com.cowaine.coalong.chapter12;

public class PriceService {
    void page269(Price productPrice, Price otherPrice) {
        int price = productPrice.add(otherPrice); // 상품 가격 합계
        int discountedPrice = calcDiscountedPrice(price); // 할인 금액
        int deliveryPrice = calcDeliveryPrice(discountedPrice); // 배송비
    }

    private int calcDeliveryPrice(int discountedPrice) {
        return 0;
    }

    private int calcDiscountedPrice(int price) {
        return 0;
    }
}
