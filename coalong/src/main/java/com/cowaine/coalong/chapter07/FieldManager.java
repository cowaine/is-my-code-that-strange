package com.cowaine.coalong.chapter07;

import java.util.List;

// 필드 맵과 관련된 제어를 담당하는 클래스
public class FieldManager {
    private static final int MAX_MEMBER_COUNT = 10;

    // 멤버를 추가합니다.
    void addMember(List<Member> members, Member newMember) {
        if (members.stream().anyMatch(member -> member.id == newMember.id)) {
            throw new RuntimeException("이미 존재하는 멤버입니다.");
        }

        if (members.size() == MAX_MEMBER_COUNT) {
            throw new RuntimeException("이 이상 멤버를 추가할 수 없습니다.");
        }
        members.add(newMember);
    }

    // 파티 멤버가 1명이라도 존재하면 true 를 리턴
    boolean partyIsAlive(List<Member> members) {
        return members.stream().anyMatch(member -> member.isAlive());
    }
}
