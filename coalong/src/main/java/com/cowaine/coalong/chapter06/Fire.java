package com.cowaine.coalong.chapter06;

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
    public int costMagicPoint() {
        return 2;
    }

    @Override
    public int attackPower() {
        return (int) (20 + member.level * 0.5);
    }

    @Override
    public int costTechnicalPoint() {
        return 0;
    }
}
