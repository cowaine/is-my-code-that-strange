package com.cowaine.coalong.chapter05.game;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum Equipment {

    EMPTY("", 0, 0, 0),
    HEAD("머리", 500000, 500, 500),
    ARMOR("갑옷", 1000, 10000, 1000),
    ARM("팔", 5000, 1000, 1000);

    private final String name;
    private final int price;
    private final int defence;
    private final int magicDefence;

}
