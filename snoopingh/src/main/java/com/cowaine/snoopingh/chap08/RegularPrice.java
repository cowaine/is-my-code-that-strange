package com.cowaine.snoopingh.chap08;

// 정가 클래스
public class RegularPrice {
    private static final int MIN_AMOUNT = 0;
    final int amount;

    RegularPrice(final int amount) {
        if (amount < MIN_AMOUNT) {
            throw new IllegalArgumentException("가격은 0 이상이어야 합니다.");
        }

        this.amount = amount;
    }
}
