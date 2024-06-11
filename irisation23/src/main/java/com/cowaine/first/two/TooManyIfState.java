package com.cowaine.first.two;

import com.cowaine.first.two.domain.Magic;
import com.cowaine.first.two.domain.Member;

public class TooManyIfState {

    /**
     * 1.3 여러 번 중첩된 로직
     *
     * @param member
     * @param magic
     */
    public void isJudge(Member member, Magic magic) {
        // 살아 있는지 판정
        if (0 < member.hitPoint) {
            // 움직일 수 있는지 판정
            if (member.canAct()) {
                // 매직포인트에 여유가 있는지 판정
                if (magic.costMagicPoint <= member.magicPoint) {
                    member.consumeMagicPoint(magic.costMagicPoint);
                    member.chant(magic);
                }
            }
        }
    }

    /**
     * 1.4 거대한 중첩
     */
    public void giantIfState() {
        /**
         *  if (조건) {
         *      if (조건) {
         *          if (조건) {
         *              // 조건문 중첩...
         *          }
         *      }
         *  }
         */
    }
}

