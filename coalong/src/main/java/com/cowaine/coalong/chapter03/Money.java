package com.cowaine.coalong.chapter03;

import java.util.Currency;

public class Money {
    int amount;         // 금액
    Currency currency;  // 통화 단위

    public Money(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }
}
