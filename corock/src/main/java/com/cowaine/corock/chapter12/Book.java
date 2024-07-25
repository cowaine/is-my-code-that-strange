package com.cowaine.corock.chapter12;

import com.cowaine.corock.chapter12.domain.DeliveryCharge;
import com.cowaine.corock.chapter12.domain.Price;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.pp268To270();
    }

    private static void pp268To270() {
        Price productPrice = new Price(39_800);
        Price otherPrice = new Price(29_800);

        Price price = productPrice.add(otherPrice);// 상품 가격 합계
        Price discountedPrice = calcDiscountedPrice(price);// 할인 금액
        Price deliveryPrice = calcDeliveryPrice(discountedPrice);// 배송비

        log.info("deliveryPrice: {}", deliveryPrice);

        // 배송 수수료 DeliveryCharge 에는 배송비가 전달되어야 하는데 상품 가격 합계가 전달되고 있음.
        DeliveryCharge deliveryCharge = new DeliveryCharge(price);
        log.info("deliveryCharge: {}", deliveryCharge);
    }

    private static Price calcDiscountedPrice(Price price) {
        return new Price((int) (price.getAmount() * 0.1));
    }

    private static Price calcDeliveryPrice(Price discountedPrice) {
        return new Price(discountedPrice.getAmount() - 2_500);
    }

}
