package com.cowaine.corock.chapter06.game;

import lombok.RequiredArgsConstructor;
import lombok.ToString;

@RequiredArgsConstructor
@ToString
public class MagicAttackResponse {

    private final String magicName;
    private final int consumeMagicPoint;
    private final int consumeTechnicalPoint;
    private final int magicDamage;

}
