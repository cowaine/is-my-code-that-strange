package com.cowaine.corock.chapter06.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HellFire implements Magic {

    private final Member member;

    /**
     * {@inheritDoc}
     */
    @Override
    public String name() {
        return "헬파이어";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MagicPoint costMagicPoint() {
        return new MagicPoint(16);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttackPower attackPower() {
        return new AttackPower(200 + (int) (member.getMagicAttack() * 0.5 + member.getVitality() * 2));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TechnicalPoint costTechnicalPoint() {
        return new TechnicalPoint(20 + (int) (member.getLevel() * 0.4));
    }

}
