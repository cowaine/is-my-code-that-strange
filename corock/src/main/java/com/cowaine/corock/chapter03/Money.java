package com.cowaine.corock.chapter03;

import lombok.Getter;

import java.util.Currency;

@Getter
public class Money {

    private int amount;             // 금액
    private Currency currency;      // 통화 단위

    public Money(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

}
