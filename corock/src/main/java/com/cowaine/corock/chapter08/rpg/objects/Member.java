package com.cowaine.corock.chapter08.rpg.objects;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Member {

    private final int id;
    private final int magicPower;
    private final int affection;

}
