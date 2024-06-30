package com.cowaine.corock.chapter08;

import com.cowaine.corock.chapter08.game.FighterPhysicalAttack;
import com.cowaine.corock.chapter08.game.PhysicalAttack;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        PhysicalAttack physicalAttack = new FighterPhysicalAttack();
        log.info("damage: {}", physicalAttack.doubleAttackDamage());
    }

}
