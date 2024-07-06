package com.cowaine.sixth.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor
@Getter
public class Member {

    private static final int INITIALIZE_HP = 100;
    private static final int INITIALIZE_MP = 50;

    private final String pk;
    private final MemberState state;
    private final int hp;
    private final int mp;
    private final int lv;
    private final int agility;

    public static Member ofNewbie() {
        return new Member(UUID.randomUUID().toString(), MemberState.ALIVE, INITIALIZE_HP, INITIALIZE_MP, 1, 5);
    }
    public boolean canAct() {
        return this.state == MemberState.ALIVE && this.hp > 0;
    }

    public Member consumeMagicPoint(int mp) {
        return new Member(this.getPk(), this.getState(), this.getHp(), this.mp - mp, this.lv,  this.agility);
    }

    public void inchant(Magic magic) {
    }

    public Member damageHp(int damage) {
        return new Member(this.pk, this.state, this.getHp() - damage, this.mp, this.lv, this.agility);
    }

    public Member changeState(MemberState memberState) {
        return new Member(this.pk, memberState, this.hp, this.mp, this.lv, this.agility);
    }
}
