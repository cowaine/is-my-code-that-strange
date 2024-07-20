package com.cowaine.coalong.mission.bank;

import lombok.Getter;

@Getter
public class Money {
    private final long amount;
    private final Currency currency;

    public Money(long amount, Currency currency) {
        this.amount = amount;
        this.currency = currency;
    }

    public Money add(Money amount) {
        return new Money(this.amount + amount.getAmount(), this.currency);
    }

    public Money subtract(Money amount) {
        return new Money(this.amount - amount.getAmount(), this.currency);
    }

    public String toString() {
        return amount + " " + currency;
    }
}
