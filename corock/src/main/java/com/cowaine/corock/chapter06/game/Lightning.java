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
    public int costMagicPoint() {
        return 5 + (int) (member.getLevel() * 0.2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int attackPower() {
        return 50 + (int) (member.getAgility() * 1.5);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int costTechnicalPoint() {
        return 5;
    }

}
