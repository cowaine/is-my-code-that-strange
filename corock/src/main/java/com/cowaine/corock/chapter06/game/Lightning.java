package com.cowaine.corock.chapter06.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Lightning implements Magic {

    private final Member member;

    /**
     * {@inheritDoc}
     */
    @Override
    public String name() {
        return "라이트닝";
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public MagicPoint costMagicPoint() {
        return new MagicPoint(5 + (int) (member.getLevel() * 0.2));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public AttackPower attackPower() {
        return new AttackPower(50 + (int) (member.getAgility() * 1.5));
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public TechnicalPoint costTechnicalPoint() {
        return new TechnicalPoint(5);
    }

}
