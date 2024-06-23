package com.cowaine.corock.chapter02.game;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Game {

    public void play(int damageAmount, int recoveryAmount) {
        // 코드 2.6 히트 포인트를 단독 변수로 만듦
        int hitPoint = 500;
        log.info("Player's initial HP: {}", hitPoint);

        // 코드 2.7 어딘가에 구현된 히트 포인트 감소 로직
        hitPoint = hitPoint - damageAmount;
        if (hitPoint < 0) {
            hitPoint = 0;
        }

        log.info("Player's HP after taking damage: {}", hitPoint);

        // (...)

        // 코드 2.8 어딘가에 구현된 회복 로직
        hitPoint = hitPoint + recoveryAmount;
        if (999 < hitPoint) {
            hitPoint = 999;
        }

        log.info("Player's HP after using a health potion: {}", hitPoint);
    }

}
