package com.cowaine.coalong.chapter05.game;

import lombok.Getter;

@Getter
public enum Equipment {

    EMPTY("장비없음", 0, 0, 0),
    HEAD("머리", 500000, 500, 500),
    ARMOR("갑옷", 1000, 10000, 1000),
    ARM("팔", 5000, 1000, 1000);

    private final String name;
    private final int price;
    private final int defence;
    private final int magicDefence;

    Equipment(String name, int price, int defence, int magicDefence) {
        if (name.isEmpty()) {
            throw new IllegalArgumentException("잘못된 이름입니다.");
        }
        this.name = name;
        this.price = price;
        this.defence = defence;
        this.magicDefence = magicDefence;
    }
}
