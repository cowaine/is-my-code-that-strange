package com.cowaine.coalong.chapter07;

import java.util.List;

public class Ex1 {
    void hasPrisonKey(List<Item> items) {
        boolean hasPrisonKey = false;
        // item 는 List<Item> 자료형
        for (Item each : items) {
            if (each.name.equals("감옥 열쇠")) {
                hasPrisonKey = true;
                break;
            }
        }
    }
}
