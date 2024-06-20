package com.cowaine.corock.chapter02;

import com.cowaine.corock.chapter02.game.Damage;
import com.cowaine.corock.chapter02.game.Game;
import com.cowaine.corock.chapter02.game.HitPoint;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        Book.pp14To17();
        Book.p18();
        Book.p19();
    }

    private static void pp14To17() {
        Damage damage = new Damage();
        log.info("damage: {}", damage.calculate(40, 30, 20, 10));
    }

    private static void p18() {
        Game game = new Game();
        game.play(70, 50);
    }

    private static void p19() {
        HitPoint hitPoint = new HitPoint(500);
        log.info("Player's initial HP: {}", hitPoint.getValue());

        HitPoint damagedHitPoint = hitPoint.damage(70);
        log.info("Player's HP after taking damage: {}", damagedHitPoint.getValue());

        HitPoint recoveredHitPoint = damagedHitPoint.recover(50);
        log.info("Player's HP after using a health potion: {}", recoveredHitPoint.getValue());
    }

}
