package com.cowaine.corock.chapter06.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Fire implements Magic {

    private final Member member;

    /**
     * {@inheritDoc}
     */
    @Override
    public String name() {
        return "파이어";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MagicPoint costMagicPoint() {
        return new MagicPoint(2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttackPower attackPower() {
        return new AttackPower(20 + (int) (member.getLevel() * 0.5));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TechnicalPoint costTechnicalPoint() {
        return new TechnicalPoint(0);
    }

}
