package com.cowaine.coalong.chapter07;

import java.util.ArrayList;
import java.util.List;

public class Party {
    static final int MAX_MEMBER_COUNT = 4;
    private final List<Member> members;

    Party() {
        members = new ArrayList<>();
    }

    private Party(List<Member> otherMembers) {
        this.members = otherMembers;
    }

    /**
     * 멤버 추가하기
     *
     * @param newMember 추가하고 싶은 멤버
     * @return 멤버를 추가한 파티
     */
    Party add(final Member newMember) {
        if (exists(newMember)) {
            throw new RuntimeException("이미 파티에 참가되어 있습니다.");
        }
        if (isFull()) {
            throw new RuntimeException("이 이상 멤버를 추가할 수 없습니다.");
        }
        final List<Member> adding = new ArrayList<>(members);
        adding.add(newMember);
        return new Party(adding);
    }

    /**
     * @return 파티 멤버가 1명이라도 살아 있으면 true 를 리턴
     */
    boolean isAlive() {
        return members.stream().allMatch(Member::isAlive);
    }

    /**
     * @param member 파티에 소속되어 있는지 확인하고 싶은 멤버
     * @return 이미 소속되어 있는 경우 true 를 리턴
     */
    private boolean exists(Member member) {
        return members.stream().anyMatch(each -> each.id == member.id);
    }

    /**
     * return 파티 인원이 최대일 경우 true 를 리턴
     */
    boolean isFull() {
        return members.size() >= MAX_MEMBER_COUNT;
    }
}
