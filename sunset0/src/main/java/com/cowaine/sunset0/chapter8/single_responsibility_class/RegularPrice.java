package com.cowaine.sunset0.chapter8.single_responsibility_class;


//8.4 정가 클래스
public class RegularPrice {

    private static final int MIN_AMOUNT = 0;
    int amount;

    public RegularPrice(final int amount) throws IllegalAccessException {
        if (amount < MIN_AMOUNT) {
            throw new IllegalAccessException("가격은 0 이상이어야 합니다.");
        }
        this.amount = amount;
    }
}
