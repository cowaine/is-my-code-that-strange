package com.cowaine.coalong.chapter11;

import com.cowaine.coalong.chapter07.StateType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Member {
    private final States states;

    // 고통받는 상태일 때 true 를 리턴
    boolean isPainful() {
        // 이후 사양 변경으로 표정 변화를 일으키는 상태를 추가할 경우 이 메서드에 로직을 추가합니다.
        if (states.contains(StateType.sleeping) || states.contains(StateType.paralyzed) ||
                states.contains(StateType.confused) || states.contains(StateType.stone) || states.contains(StateType.dead)) {
            return false;
        }
        return true;
    }
}
