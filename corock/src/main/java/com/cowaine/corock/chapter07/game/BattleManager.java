package com.cowaine.corock.chapter07.game;

import java.util.List;

// 전투를 제어하는 클래스
public class BattleManager {

    // 파티 멤버가 1명이라도 존재하는 경우 true 를 반환
    boolean membersAreAlive(List<Member> members) {
        boolean result = false;
        for (Member each : members) {
            if (each.isAlive()) {
                result = true;
                break;
            }
        }
        return result;
    }

}
