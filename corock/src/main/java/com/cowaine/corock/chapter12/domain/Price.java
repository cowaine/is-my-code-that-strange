package com.cowaine.corock.chapter12.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@Getter
@ToString
public class Price {

    private final int amount;

    // (...)

    public Price add(final Price other) {
        final int added = amount + other.amount;
        return new Price(added);
    }

}
