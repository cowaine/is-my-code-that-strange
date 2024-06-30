package com.cowaine.corock.chapter07.game;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
@Getter
public class MemberService {

    private final List<Member> members;

    public void reduceHitPointForPoisonedMembers() {
        for (Member member : members) {
            if (0 < member.getHitPoint()) {
                if (member.containsState(StateType.POISON)) {
                    member.setHitPoint(10);

                    if (member.getHitPoint() <= 0) {
                        member.setHitPoint(0);
                        member.addState(StateType.DEAD);
                        member.removeState(StateType.POISON);
                    }
                }
            }
        }
    }

}
