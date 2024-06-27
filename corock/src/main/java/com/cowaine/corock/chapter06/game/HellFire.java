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
    public int costMagicPoint() {
        return 16;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int attackPower() {
        return 200 + (int) (member.getMagicAttack() * 0.5 + member.getVitality() * 2);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int costTechnicalPoint() {
        return 20 + (int) (member.getLevel() * 0.4);
    }

}
