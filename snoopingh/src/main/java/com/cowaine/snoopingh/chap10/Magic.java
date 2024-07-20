package com.cowaine.snoopingh.chap10;

public class Magic {
    private final int costMagicPoint = 0;

    // 로직 구조를 나타내는 이름을 메서드에 사용하지 말 것.
//    boolean isMemberHpMoreThanZeroAndIsMemberCanActAndIsMemberMpMoreThanMagicCostMp(Member member) {
//        if (0 < member.hitPoint) {
//            if (member.canAct()) {
//
//                if (costMagicPoint <= member.magicPoint) {
//                    return true;
//                }
//            }
//        }
//        return false;
//    }

    boolean canEnchant(final Member member) {
        if (member.hitPoint <= 0) return false;
        if (!member.canAct()) return false;
        if (member.magicPoint < costMagicPoint) return false;
        return true;
    }
}
