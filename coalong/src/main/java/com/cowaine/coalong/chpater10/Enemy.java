package com.cowaine.coalong.chpater10;

import com.cowaine.coalong.chapter07.Item;

import java.util.List;

public class Enemy {
    boolean isAppeared;
    int magicPoint;
    Item dropItem;

    // 도망치기
    void escape() {
        isAppeared = false;
    }

    // 매직포인트 소비
    void consumeMagicPoint(int costMagicPoint) {
        magicPoint -= costMagicPoint;
        if (magicPoint <= 0) {
            magicPoint = 0;
        }
    }

    // 주인공 파티에 아이템 추가하기
    // 추가할 수 있다면 true 를 리턴
    boolean addItemToParty(List<Item> items) {
        if (items.size() < 99) {
            items.add(dropItem);
            return true;
        }
        return false;
    }
}
