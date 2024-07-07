package com.cowaine.corock.chapter08.domain;

class SellingPrice {

    private final int amount;

    SellingPrice(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("가격은 0 이상이어야 합니다.");
        }
        this.amount = amount;
    }

}
