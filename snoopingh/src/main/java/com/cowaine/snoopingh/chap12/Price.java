package com.cowaine.snoopingh.chap12;

public class Price {
    private final int amount;

    Price(final int amount) {
        this.amount = amount;
    }

//    int add(final Price other) {
//        return amount + other.amount;
//    }

    Price add(final Price other) {
        final int added = amount + other.amount;
        return new Price(added);
    }

    // Price price = productPrice.add(otherPrice);
    // DiscountedPrice discountedPrice = new DiscountedPrice(price);
    // DeliveryPrice deliveryPrice = new DeliveryPrice(discountedPrice);
    // 자료형 자체가 다르므로, 매개변수로 값을 잘 못 전달하는 실수를 방지할 수 있다.
}
