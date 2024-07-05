package com.cowaine.sunset0.chapter7;

import java.beans.beancontext.BeanContext;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//7.11 리스트자료형의 인스턴스 변수를 갖는 클래스 (일급 컬렉션)
public class Party {
    private static final int MAX_MEMBER_COUNT = 100;
    private List<Member> members;

    public Party() {
        this.members = new ArrayList<>();
    }

    private Party(List<Member> members) {
        this.members = new ArrayList<>(members);
    }

    //7.13 부수효과가 발생하지 않는 메서드
    Party add(final Member newMember) {
        if (exist(newMember)) {
            throw new RuntimeException("이미 파티에 참가되어 있습니다");
        }
        if (isFull()) {
            throw new RuntimeException("이 이상 멤버를 추가할 수 없습니다");
        }

        final List<Member> adding = new ArrayList<>(members);
        adding.add(newMember);
        return new Party(adding);
    }

    public boolean isAlive() {
        return members.stream().anyMatch(each -> each.isAlive());
    }

    public boolean isFull() {
        return members.size() == MAX_MEMBER_COUNT;
    }

    public boolean exist(final Member member) {
        return members.stream().anyMatch(each -> each.id == member.id);
    }

    /**
     * @return 멤버 리스트 (외부에서 변경 불가)
     */
    List<Member> members() {
        return (List<Member>) Collections.unmodifiableCollection(members);
    }


}
