package com.cowaine.coalong.chapter03;

import java.util.Currency;

public class Money {
    public final int amount;         // 금액
    public final Currency currency;  // 통화 단위

    public Money(final  int amount, final Currency currency) {
        if (amount < 0) {
            throw new IllegalArgumentException("amount must be positive");
        }

        if (currency == null) {
            throw new IllegalArgumentException("currency must not be null");
        }

        this.amount = amount;
        this.currency = currency;
    }

    public Money add(final Money other) {
        if (!currency.equals(other.currency)) {
            throw new IllegalArgumentException("currency does not match");
        }

        final int added = amount + other.amount;
        return new Money(added, currency);
    }
}
