package com.cowaine.corock.chapter10.game;

import java.util.ArrayList;
import java.util.List;

class PartyItems {

    private static final int MAX_ITEM_COUNT = 99;

    private final List<Item> items;

    PartyItems() {
        this.items = new ArrayList<>();
    }

    private PartyItems(List<Item> items) {
        this.items = items;
    }

    public PartyItems add(final Item newItem) {
        if (MAX_ITEM_COUNT == items.size()) {
            throw new RuntimeException("이 이상으로 아이템을 소지할 수 없습니다.");
        }

        final List<Item> adding = new ArrayList<>(items);
        adding.add(newItem);

        return new PartyItems(adding);
    }

}
