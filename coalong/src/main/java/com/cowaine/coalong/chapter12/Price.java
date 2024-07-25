package com.cowaine.coalong.chapter12;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Price {
    private final int amount;
    int add(final Price other) {
        return amount + other.amount;
    }
}
