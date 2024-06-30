package com.cowaine.coalong.chapter06;

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
    public int costMagicPoint() {
        return (int) (5 + member.level * 0.2);
    }

    @Override
    public int attackPower() {
        return (int) (member.level * 0.2);
    }

    @Override
    public int costTechnicalPoint() {
        return 5;
    }
}
