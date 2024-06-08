package com.cowaine.corock.chapter01.game;

public class RpgService {

    public void cast(Member member, Magic magic) {
        // 살아 있는지 판정
        if (0 < member.hitPoint) {
            // 움직일 수 있는지 판정
            if (member.canAct()) {
                // 매직 포인트에 여유가 있는지 판정
                if (magic.costMagicPoint <= member.magicPoint) {
                    member.consumeMagicPoint(magic.costMagicPoint);
                    member.chant(magic);
                }
            }
        }

        // if (true /* 조건 */) {
        //     // (...)
        //
        //     if (true /* 조건 */) {
        //         // (...)
        //
        //         if (true /* 조건 */) {
        //             // (...)
        //
        //             if (true /* 조건 */) {
        //                 // (...)
        //             }
        //         }
        //     }
        // }
    }

}
