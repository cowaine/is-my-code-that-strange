package com.cowaine.firewoody237.bad_code;

import java.util.Currency;

public class Money {
    int amount;
    Currency currency;

    public Money(int amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money(int amount) {
        this.amount = amount;
    }

    public Money() {
    }
}
