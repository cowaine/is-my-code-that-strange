package com.cowaine.coalong.chapter07;

import java.util.List;

public class Ex1 {
    void hasPrisonKey(List<Item> items) {
        boolean hasPrisonKey = items.stream().anyMatch(
                item -> item.name.equals("감옥 열쇠")
        );
    }
}
