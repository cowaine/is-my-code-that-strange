package com.cowaine.corock.chapter08.rpg.view;

import com.cowaine.corock.chapter08.rpg.objects.Member;
import com.cowaine.corock.chapter08.rpg.objects.PositiveFeelings;

/**
 * 전투 화면
 */
public class BattleView {

    private PositiveFeelings positiveFeelings;

    // (...)

    public void startAttackAnimation() {
        Member member1 = new Member(1, 10, 2);
        Member member2 = new Member(2, 20, 3);

        // (...)

        positiveFeelings.increase(member1.getId(), member2.getId());
    }

}
