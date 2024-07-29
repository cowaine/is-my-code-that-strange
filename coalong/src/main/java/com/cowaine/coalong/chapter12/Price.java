package com.cowaine.coalong.chapter12;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Price {
    private final int amount;

    Price add(final Price other) {
        return new Price(amount + other.amount);
    }
}
