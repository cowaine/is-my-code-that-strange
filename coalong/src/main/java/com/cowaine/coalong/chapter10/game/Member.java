package com.cowaine.coalong.chapter10.game;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Member {
    private final int maxHitPoint;
    private final int hitPoint;
    private final int hpPoint;
    public final int getMagicPoint;

    public boolean canAct() {
        if (hpPoint > 0) return true;
        return false;
    }
}
