package com.cowaine.coalong.chapter12;

public class PriceService {
    void page269(Price productPrice, Price otherPrice) {
        Price price = productPrice.add(otherPrice); // 상품 가격 합계
        DiscountedPrice discountedPrice = new DiscountedPrice(price); // 할인 금액
        DeliveryPrice deliveryPrice = new DeliveryPrice(discountedPrice); // 배송비
        DeliveryCharge deliveryCharge = new DeliveryCharge(deliveryPrice); // 배송 수수료
    }

    private int calcDeliveryPrice(int discountedPrice) {
        return 0;
    }

    private int calcDiscountedPrice(int price) {
        return 0;
    }
}
