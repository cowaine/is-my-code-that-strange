package com.cowaine.sunset0.chapter6.strategy_pattern.magic;

import com.cowaine.sunset0.chapter6.if_overlap.Member;


//인터페이스, 값 객체 도입
public class Fire implements Magic {

    private final Member member;


    public Fire(Member member) {
        this.member = member;
    }

    @Override
    public String name() {
        return "파이어";
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
