package com.cowaine.corock.chapter07.game;

import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public class Party {

    private static final int MAX_MEMBER_COUNT = 6;

    private final List<Member> members;

    public Party() {
        this.members = new ArrayList<>();
    }

    // (...)

    public List<Member> members() {
        return members;
    }

    /**
     * 멤버를 추가한다.
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

        ArrayList<Member> adding = new ArrayList<>(members);
        adding.add(newMember);

        return new Party(adding);
    }

    /**
     * @return 파티 멤버가 1명이라도 살아 있으면 true 반환
     */
    boolean isAlive() {
        return members.stream().anyMatch(each -> each.isAlive());
    }

    /**
     * @param member 파티에 소속되어 있는지 확인하고 싶은 멤버
     * @return 이미 소속되어 있는 경우 true 반환
     */
    private boolean exists(Member member) {
        return members.stream().anyMatch(each -> each.getId() == member.getId());
    }

    /**
     * @return 파티 인원이 최대일 경우 true 반환
     */
    private boolean isFull() {
        return members.size() == MAX_MEMBER_COUNT;
    }

}
