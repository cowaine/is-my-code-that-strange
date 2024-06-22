package com.cowaine.coalong.chapter05;

public class DiscountManager {
    // 할인 적용하기
    void set(MoneyData money) {
        money.amount -= 2000;
        if (money.amount <= 0) {
            money.amount = 0;
        }
    }
}
