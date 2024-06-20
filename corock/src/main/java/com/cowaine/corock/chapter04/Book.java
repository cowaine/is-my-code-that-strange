package com.cowaine.corock.chapter04;

import com.cowaine.corock.chapter04.game.Damage;
import com.cowaine.corock.chapter04.game.Enemy;
import com.cowaine.corock.chapter04.game.Member;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        log.info("tmp: {}", new Damage(new Member(), new Enemy(30)).damage());
    }

}
