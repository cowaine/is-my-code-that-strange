package com.cowaine.sixth.domain.magic;

import com.cowaine.sixth.domain.Member;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Lightning implements Magic {
    private final Member member;

    @Override
    public String name() {
        return "라이트닝";
    }

    @Override
    public int costMagicPoint() {
        return 5 + (int) (member.getLv() * 0.2);
    }

    @Override
    public int attackPower() {
        return 50 + (int) (member.getAgility() * 1.5);
    }

    @Override
    public int costTechnicalPoint() {
        return 5;
    }
}
