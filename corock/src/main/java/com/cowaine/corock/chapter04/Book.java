package com.cowaine.corock.chapter04;

import com.cowaine.corock.chapter04.game.Damage;
import com.cowaine.corock.chapter04.game.Enemy;
import com.cowaine.corock.chapter04.game.Member;
import com.cowaine.corock.chapter04.product.Product;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.pp42To43();

        Product product = new Product(39_800);
        log.info("price: {}", product.addPrice(19_800));
    }

    private static void pp42To43() {
        log.info("damage: {}", new Damage(new Member(), new Enemy(30)).damage());
    }

}
