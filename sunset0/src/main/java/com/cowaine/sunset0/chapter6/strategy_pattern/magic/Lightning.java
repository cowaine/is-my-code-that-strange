package com.cowaine.sunset0.chapter6.strategy_pattern.magic;

import com.cowaine.sunset0.chapter6.if_overlap.Member;

public class Lightning implements Magic {

    private final Member member;


    public Lightning(Member member) {
        this.member = member;
    }

    @Override
    public String name() {
        return "라이트닝";
    }

    @Override
    public MagicPoint costMagicPoint() {
        return new MagicPoint(2);
    }

    @Override
    public AttackPower attackPower() {
        return new AttackPower(20 + (int) (member.level * 0.5));
    }

    @Override
    public TechnicalPoint costTechnicalPoint() {
        return new TechnicalPoint(0);
    }
}
