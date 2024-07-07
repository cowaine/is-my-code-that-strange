package com.cowaine.corock.chapter08.discount;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Product {

    @Getter
    private final int id;

    @Getter
    private final String name;

    @Getter
    private final int price;

    // 새로 추가했음(여름 할인이 가능한 경우 true)
    private final boolean canDiscount;

    public boolean canDiscount() {
        return canDiscount;
    }

}
