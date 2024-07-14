package com.cowaine.corock.chapter10.game;

import com.cowaine.corock.chapter10.common.StateType;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Member {

    private final int maxHitPoint;

    private final int hitPoint;
    private final int magicPoint;
    private final States states;

    public boolean canAct() {
        return hitPoint > 0;
    }

    public boolean isInConfusion() {
        return states.contains(StateType.CONFUSED);
    }

}
