package com.cowaine.corock.chapter05.domain;

@Deprecated(forRemoval = true)
public class DiscountManager {

    @Deprecated(forRemoval = true)
    public void set(MoneyData money) {
        money.setAmount(money.getAmount() - 2000);
        if (money.getAmount() < 0) {
            money.setAmount(0);
        }
    }

}
