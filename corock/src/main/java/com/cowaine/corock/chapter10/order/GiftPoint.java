package com.cowaine.corock.chapter10.order;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class GiftPoint {

    private final int value;

    public GiftPoint add(final GiftPoint other) {
        return new GiftPoint(value + other.value);
    }

}
