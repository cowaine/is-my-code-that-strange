package com.cowaine.corock.chapter07.game;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class Character {

    private final List<Item> items;

    public boolean hasPrisonKey() {
        return items.stream().anyMatch(item -> item.getName().equals("감옥 열쇠"));
    }

}
