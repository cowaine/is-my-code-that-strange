package com.cowaine.sixth.domain.magic;

import com.cowaine.sixth.domain.Member;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Fire implements Magic{

    private final Member member;

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
        return 20 + (int) (member.getLv() * 0.5);
    }

    @Override
    public int costTechnicalPoint() {
        return 0;
    }
}
