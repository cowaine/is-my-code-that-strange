package com.cowaine.corock.chapter03;

import lombok.Getter;

import java.util.Currency;

@Getter
public class Money {

    public int amount;
    private Currency currency;

    public Money(int amount, Currency currency) {
        if (amount < 0) {
            throw new IllegalArgumentException("금액은 0 이상의 값을 지정해 주세요.");
        }

        if (currency == null) {
            throw new NullPointerException("통화 단위를 지정해 주세요.");
        }

        this.amount = amount;
        this.currency = currency;
    }

    public void add(int other) {
        this.amount += other;
    }

}
