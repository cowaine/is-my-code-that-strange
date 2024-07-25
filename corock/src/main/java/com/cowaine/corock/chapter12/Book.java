package com.cowaine.corock.chapter12;

import com.cowaine.corock.chapter12.domain.Price;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        Price productPrice = new Price(39_800);
        Price otherPrice = new Price(29_800);

        int price = productPrice.add(otherPrice);                   // 상품 가격 합계
        int discountedPrice = calcDiscountedPrice(price);           // 할인 금액
        int deliveryPrice = calcDeliveryPrice(discountedPrice);     // 배송비

        log.info("deliveryPrice: {}", deliveryPrice);
    }

    private static int calcDiscountedPrice(int price) {
        return (int) (price * 0.1);
    }

    private static int calcDeliveryPrice(int discountedPrice) {
        return discountedPrice - 2_500;
    }

}
