package com.cowaine.sunset0.chapter11;

import com.cowaine.sunset0.chapter4.use_immutability_variability.StateType;

//11.6 의도와 사양 변경 시 주의 사항을 주석으로 달기
public class Member {

    private States states;

    boolean isPainful() {
        //이후 사양 변경으로 표정 변화를 일으키는 상태를 추가할 경우
        //이 메서드에 로직을 추가합니다.
        if (states.contains(StateType.poison) || states.contains(StateType.paralyed) || states.contains(StateType.fear)) {
            return true;
        }
        return false;
    }
}
