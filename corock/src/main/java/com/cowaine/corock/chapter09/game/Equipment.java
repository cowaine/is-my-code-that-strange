package com.cowaine.corock.chapter09.game;

import lombok.Getter;

@Getter
public class Equipment {

    static final Equipment EMPTY = new Equipment("장비 없음", 0, 0, 0);

    private final String name;
    private final int price;
    private final int defense;
    private final int magicDefense;

    public Equipment(String name, int price, int defense, int magicDefense) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("잘못된 이름입니다.");
        }

        this.name = name;
        this.price = price;
        this.defense = defense;
        this.magicDefense = magicDefense;
    }

}
