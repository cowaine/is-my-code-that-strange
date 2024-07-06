package com.cowaine.seventh.one;

import com.cowaine.seventh.domain.Item;

import java.util.ArrayList;
import java.util.List;

public class 이미_존재하는_기능을_다시_구현하지_말기 {
    public static void main(String[] args) {
        // 7.1.1 '감옥 열쇠'를 소지하고 있는지 확인하는 코드
        boolean hasPrisonKey = false;
        List<Item> items = new ArrayList<>();
        items.add(new Item("일반 열쇠"));
        items.add(new Item("감옥 열쇠"));

        for (Item item : items) {
            if (item.getName().equals("감옥 열쇠")) {
                hasPrisonKey = true;
                break;
            }
        }

        // 7.1.2 anyMatch 메서드
        boolean hasPrisonKey2 = items.stream().anyMatch(
                i -> i.getName().equals("감옥 열쇠")
        );
    }
}
