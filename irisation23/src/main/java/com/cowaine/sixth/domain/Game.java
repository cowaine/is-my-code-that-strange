package com.cowaine.sixth.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
@Getter
public class Game {

    private final Map<Integer, Member> members;
    private final Map<Integer, Magic> magics;

    public void start() {
        memberInit();
        magicInit();
    }
    private void memberInit() {
        members.put(1, Member.ofNewbie());
        members.put(2, Member.ofNewbie());
        members.put(3, Member.ofNewbie());
        members.put(4, Member.ofNewbie());
        members.put(5, Member.ofNewbie());
    }

    private void magicInit() {
        magics.put(1, Magic.ofFireBall());
        magics.put(2, Magic.ofRockDrop());
        magics.put(3, Magic.ofHolyLight());
        magics.put(4, Magic.ofBlackHall());
    }
}
