package com.cowaine.corock.chapter05.payment;

import lombok.Getter;

@Getter
public class PaymentManager {

    // 할인율
    private int discountRate;

    public int add(int moneyAmount1, int moneyAmount2) {
        return moneyAmount1 + moneyAmount2;
    }

}
