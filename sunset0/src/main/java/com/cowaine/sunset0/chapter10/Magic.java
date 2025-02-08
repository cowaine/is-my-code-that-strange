package com.cowaine.sunset0.chapter10;

public class Magic {
    int costMagicPoint = 10;

    //10.8 로직 구조를 나타내는 이름
    boolean isMemberHpMoreThanZeroAndIsMemberCanActAndIsMemberMpMoreThanMagicCostMp(Member member) {
        if (0 < member.hitPoint) {
            if (member.canAct()) {
                if (costMagicPoint <= member.magicPoint) {
                    return true;
                }
            }
        }

        return false;
    }

    //10.9 의도와 목적을 알기 쉽게 이름 개선하기
    boolean canEnchant(final Member member) {
        if (member.hitPoint <= 0) {
            return false;
        }
        if(!member.canAct()) {
            return false;
        }
        if (member.magicPoint < costMagicPoint) {
            return false;
        }

        return true;
    }

    public static class Member {
        public int hitPoint;
        public int magicPoint;

        public boolean canAct() {
            return false;
        }
    }
}
