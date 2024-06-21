package com.cowaine.corock.chapter05.order;

import lombok.Getter;

@Getter
public class Money {

    private final int amount;

    public Money(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("금액은 0 이상의 값을 지정해 주세요.");
        }

        this.amount = amount;
    }

    public Money add(final Money other) {
        return new Money(amount + other.amount);
    }

}
