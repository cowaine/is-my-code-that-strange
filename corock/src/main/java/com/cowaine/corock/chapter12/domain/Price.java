package com.cowaine.corock.chapter12.domain;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Price {

    private final int amount;

    // (...)

    public int add(final Price other) {
        return amount + other.amount;
    }

}
