package com.cowaine.coalong.chapter10;


import java.util.ArrayList;
import java.util.List;

public class PartyItems extends Item {
    static final int MAX_ITEM_COUNT = 99;
    final List<Item> items;

    PartyItems() {
        items = new ArrayList<>();
    }

    private PartyItems(final List<Item> items) {
        this.items = items;
    }

    PartyItems add(final PartyItems newItem) {
        if (items.size() == MAX_ITEM_COUNT) {
            throw new RuntimeException("Too many items");
        }

        final List<Item> adding = new ArrayList<>(items);
        adding.add(newItem);
        return new PartyItems(adding);
    }
}
