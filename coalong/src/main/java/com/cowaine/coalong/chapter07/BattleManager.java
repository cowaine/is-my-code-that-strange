package com.cowaine.coalong.chapter07;

import java.util.List;

// 전투를 제어하는 클래스
public class BattleManager {
    // 파티 멤버가 1명이라도 존재하는 경우 true 를 리턴
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
