package com.cowaine.coalong.chapter11;

import com.cowaine.coalong.chapter07.StateType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Member {
    private final States states;

    boolean canAct() {
        // 행동 불능 사양이 변경되는 경우
        // 다음 로직을 변경합니다.
        if (states.contains(StateType.sleeping) || states.contains(StateType.paralyzed) ||
                states.contains(StateType.confused) || states.contains(StateType.stone) || states.contains(StateType.dead)) {
            return false;
        }
        return true;
    }
}
