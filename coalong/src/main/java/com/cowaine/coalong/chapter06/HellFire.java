package com.cowaine.coalong.chapter06;

public class HellFire implements Magic {
    private final Member member;

    public HellFire(Member member) {
        this.member = member;
    }

    @Override
    public String name() {
        return "헬파이어";
    }

    @Override
    public int costMagicPoint() {
        return 16;
    }

    @Override
    public int attackPower() {
        return (int) (200 + member.magicAttack * 0.5 + member.vitality * 2);
    }

    @Override
    public int costTechnicalPoint() {
        return (int) (20 + member.level * 0.4);
    }
}
