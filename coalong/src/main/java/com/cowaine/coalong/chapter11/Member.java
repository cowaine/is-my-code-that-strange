package com.cowaine.coalong.chapter11;

import com.cowaine.coalong.chapter07.StateType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Member {
    private final States states;

    // 수면, 마비, 혼란, 석화, 사망 이외의 상황에서 행동 가능
    boolean isNotSleepingAndIsNotParalyzedAndIsNotConfusedAndIsNotStoneAndIsNotDead() {
        if (states.contains(StateType.sleeping) || states.contains(StateType.paralyzed) ||
                states.contains(StateType.confused) || states.contains(StateType.stone) || states.contains(StateType.dead)) {
            return false;
        }
        return true;
    }
}
