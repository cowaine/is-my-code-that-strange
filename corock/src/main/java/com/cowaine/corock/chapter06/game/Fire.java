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
    public int costMagicPoint() {
        return 2;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int attackPower() {
        return 20 + (int) (member.getLevel() * 0.5);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int costTechnicalPoint() {
        return 0;
    }

}
