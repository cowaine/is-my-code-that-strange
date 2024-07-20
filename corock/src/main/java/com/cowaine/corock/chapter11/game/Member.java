package com.cowaine.corock.chapter11.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Member {

    private final States states;

    // 힘든 상태일 때 true 를 반환
    // 중독, 마비 상태일 때 true 를 반환
    public boolean isPainful() {
        if (states.contains(StateType.POISON) || states.contains(StateType.PARALYZED)
                || states.contains(StateType.FEAR)) {
            return true;
        }
        return false;
    }

    public boolean isNotSleepingAndIsNotParalyzedAndIsNotConfusedAndIsNotStoneAndIsNotDead() {
        if (states.contains(StateType.POISON) || states.contains(StateType.PARALYZED)
                || states.contains(StateType.FEAR) || states.contains(StateType.STONE)
                || states.contains(StateType.DEAD)) {
            return true;
        }
        return false;
    }

}
