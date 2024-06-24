package com.cowaine.corock.chapter06.game;

public class RpgService {

    public void cast(Member member, Magic magic) {
        // 살아 있는가
        if (0 < member.getHitPoint()) {
            // 움직일 수 있는가
            if (member.canAct()) {
                // 매직 포인트가 남아 있는가
                if (magic.getCostMagicPoint() <= member.getMagicPoint()) {
                    member.consumeMagicPoint(magic.getCostMagicPoint());
                    member.chant(magic);
                }
            }
        }

        /*
         * if (조건) {
         *
         *     // 수십 ~ 수백 줄의 코드
         *
         *     if (조건) {
         *
         *         // 수십 ~ 수백 줄의 코드
         *
         *         if (조건) {
         *
         *             // 수십 ~ 수백 줄의 코드
         *
         *             if (조건) {
         *
         *                 // 수십 ~ 수백 줄의 코드
         *
         *             }
         *         }
         *
         *         // 수십 ~ 수백 줄의 코드
         *
         *     }
         *
         *     // 수십 ~ 수백 줄의 코드
         *
         * }
         */
    }

}
