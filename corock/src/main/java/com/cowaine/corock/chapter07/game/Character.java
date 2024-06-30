package com.cowaine.corock.chapter07.game;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class Character {

    private final List<Item> items;

    public boolean hasPrisonKey() {
        boolean hasPrisonKey = false;

        // items 는 List<Item> 자료형
        for (Item each : items) {
            if (each.getName().equals("감옥 열쇠")) {
                hasPrisonKey = true;
                break;
            }
        }

        return hasPrisonKey;
    }

}
