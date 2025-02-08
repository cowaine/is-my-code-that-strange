package com.cowaine.sunset0.chapter7;

import java.util.ArrayList;
import java.util.List;

public class Game {

    // 7.1 감옥 열쇠를 소지하고 있는지 확인하는 코드, 이미 존재하는 코드를 다시 구현하지 말자!
    public boolean checkPrisonKey() {
        boolean hasPrisonKey = false;
        List<Item> items = new ArrayList<>();

        for (Item each : items) {
            if (each.name.equals("감옥 열쇠")) {
                hasPrisonKey = true;
                break;
            }
        }
        return hasPrisonKey;
    }

    //7.2 anyMatches 메서드 사용
    public boolean checkPrisonKeyWithAnyMatches() {
        List<Item> items = new ArrayList<>();
        boolean hasPrisonKey = items.stream().anyMatch(item -> item.name.equals("감옥 열쇠"));
        return hasPrisonKey;
    }


    public static class Item {
        String name;

        public Item(String name) {
            this.name = name;
        }
    }
}
