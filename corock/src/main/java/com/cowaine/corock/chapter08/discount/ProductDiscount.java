package com.cowaine.corock.chapter08.discount;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ProductDiscount {

    @Getter
    private final int id;

    private final boolean canDiscount;

    public boolean canDiscount() {
        return this.canDiscount;
    }

}
