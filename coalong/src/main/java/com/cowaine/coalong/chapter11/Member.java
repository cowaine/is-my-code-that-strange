package com.cowaine.coalong.chapter11;

import com.cowaine.coalong.chapter07.StateType;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Member {
    private final States states;

    // 힘든 상태일 때 true 를 리턴
    // 중독, 마비 상태일 때 true 를 리턴
    boolean isPainful() {
        if (states.contains(StateType.poison) || states.contains(StateType.paralyzed) || states.contains(StateType.fear)) {
            return true;
        }
        return false;
    }
}
