package com.cowaine.corock.chapter10.common;

import com.cowaine.corock.chapter10.game.Member;

@Deprecated(forRemoval = true)
public class Common {

    // 멤버가 혼란(Confusion) 상태라면 true 를 반환
    @Deprecated(forRemoval = true)
    public static boolean isMemberInConfusion(Member member) {
        return member.getStates().contains(StateType.CONFUSED);
    }

}
