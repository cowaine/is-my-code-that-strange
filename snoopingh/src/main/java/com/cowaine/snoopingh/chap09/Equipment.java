package com.cowaine.snoopingh.chap09;

public class Equipment {
    static final Equipment EMPTY = new Equipment("장비 없음", 0, 0, 0);

    final String name;
    final int price;
    final int defence;
    final int magicDefence;
//    public int defence;

    Equipment(final String name, final int price, final int defence, final int magicDefence) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("잘못된 이름입니다.");
        }

        this.name = name;
        this.price = price;
        this.defence = defence;
        this.magicDefence = magicDefence;
    }
}
