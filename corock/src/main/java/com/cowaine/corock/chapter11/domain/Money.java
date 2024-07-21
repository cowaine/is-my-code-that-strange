package com.cowaine.corock.chapter11.domain;

import lombok.RequiredArgsConstructor;

import java.util.Currency;

@RequiredArgsConstructor
class Money {

    private final int amount;
    private final Currency currency;

    // (...)

    /**
     * 금액을 추가합니다.
     *
     * @param other 추가 금액
     * @return 추가 후의 금액
     * @throws IllegalArgumentException 통화 단위가 다르면 예외 발생
     */
    Money add(final Money other) {
        if (!currency.equals(other.currency)) {
            throw new IllegalArgumentException("통화 단위가 다릅니다.");
        }

        int added = amount + other.amount;
        return new Money(added, currency);
    }

}
