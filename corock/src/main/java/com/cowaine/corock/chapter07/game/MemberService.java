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
            /*
             * 살아 있지 않다면 continue 로 다음 반복으로 넘어감.
             * 조기 continue 로 변경하려면 조건을 반전해야 함.
             */
            if (member.getHitPoint() == 0) {
                continue;
            }

            if (!member.containsState(StateType.POISON)) {
                continue;
            }

            member.setHitPoint(10);

            if (0 < member.getHitPoint()) {
                continue;
            }

            member.setHitPoint(0);
            member.addState(StateType.DEAD);
            member.removeState(StateType.POISON);
        }
    }

}
