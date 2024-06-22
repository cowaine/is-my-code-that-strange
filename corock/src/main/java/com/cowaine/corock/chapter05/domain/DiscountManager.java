package com.cowaine.corock.chapter05.domain;

public class DiscountManager {

    public void set(MoneyData money) {
        money.setAmount(money.getAmount() - 2000);
        if (money.getAmount() < 0) {
            money.setAmount(0);
        }
    }

}
