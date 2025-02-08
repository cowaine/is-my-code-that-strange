package com.cowaine.corock.chapter11.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Member {

    private final States states;

    // 고통받는 상태일 때 true 를 반환
    public boolean isPainful() {
        // 이후 사양 변경으로 표정 변화를 일으키는 상태를 추가할 경우 이 메서드에 로직을 추가합니다.
        if (states.contains(StateType.POISON) || states.contains(StateType.PARALYZED)
                || states.contains(StateType.FEAR)) {
            return true;
        }
        return false;
    }

    public boolean canAct() {
        if (states.contains(StateType.POISON) || states.contains(StateType.PARALYZED)
                || states.contains(StateType.FEAR) || states.contains(StateType.STONE)
                || states.contains(StateType.DEAD)) {
            return true;
        }
        return false;
    }

}
