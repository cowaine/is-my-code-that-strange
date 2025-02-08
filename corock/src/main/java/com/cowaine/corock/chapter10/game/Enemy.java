package com.cowaine.corock.chapter10.game;

import java.util.List;

public class Enemy {

    private boolean isAppeared;
    private int magicPoint;
    private Item dropItem;

    /**
     * 도망친다.
     */
    void escape() {
        this.isAppeared = false;
    }

    /**
     * 매직 포인트를 소비한다.
     *
     * @param costMagicPoint 매직 포인트 소비량
     */
    void consumeMagicPoint(int costMagicPoint) {
        this.magicPoint -= costMagicPoint;
        if (magicPoint < 0) {
            magicPoint = 0;
        }
    }

    /**
     * 주인공 파티에 아이템을 추가한다.
     *
     * @param items 아이템 목록
     * @return 아이템을 추가할 수 있으면 true
     */
    @Deprecated(forRemoval = true)
    boolean addItemToParty(List<Item> items) {
        if (items.size() < 99) {
            items.add(dropItem);
            return true;
        }
        return false;
    }

}
