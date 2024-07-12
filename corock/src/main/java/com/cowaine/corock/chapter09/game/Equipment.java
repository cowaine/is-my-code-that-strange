package com.cowaine.corock.chapter09.game;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public class Equipment {

    private final String name;
    private final int defense;
    private final int magicDefense;

}
