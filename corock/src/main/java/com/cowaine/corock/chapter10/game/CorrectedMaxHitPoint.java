package com.cowaine.corock.chapter10.game;

import lombok.ToString;

@ToString
public class CorrectedMaxHitPoint {

    private final int value;

    public CorrectedMaxHitPoint(final OriginalMaxHitPoint originalMaxHitPoint, final Accessory accessory,
                                final Armor armor) {
        this.value = originalMaxHitPoint.getValue() + accessory.maxHitPointIncrements() + armor.maxHitPointIncrements();
    }

}
