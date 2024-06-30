package com.cowaine.snoopingh.chap06.lsp;

public class Money {
    private final int price;
    public Money(int price) {
        this.price = price;
    }

    public Money add(Money money) {
        return new Money(this.price + money.price);
    }
}
