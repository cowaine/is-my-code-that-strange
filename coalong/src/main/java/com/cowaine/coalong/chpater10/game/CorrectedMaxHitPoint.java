package com.cowaine.coalong.chpater10.game;

import com.cowaine.coalong.chapter05.game.Armor;

public class CorrectedMaxHitPoint {
    private final int value;

    public CorrectedMaxHitPoint(final OriginalMaxHitPoint originalMaxHitPoint, final Accessory accessory,
                                final Armor armor) {
        this.value = originalMaxHitPoint.getValue() + accessory.maxHitPointIncrements() + armor.maxHitPointIncrements();
    }
}
