package com.cowaine.coalong.chapter05.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Equipment {
    public static final Equipment EMPTY = new Equipment(null, 0, 0, 0);

    final String name;
    final int price;
    final int defence;
    final int magicDefence;
}
