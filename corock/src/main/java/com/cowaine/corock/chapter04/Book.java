package com.cowaine.corock.chapter04;

import com.cowaine.corock.chapter04.game.AttackPower;
import com.cowaine.corock.chapter04.game.Damage;
import com.cowaine.corock.chapter04.game.Enemy;
import com.cowaine.corock.chapter04.game.Member;
import com.cowaine.corock.chapter04.game.Weapon;
import com.cowaine.corock.chapter04.product.Product;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.pp42To43();
        // Book.p44();

        AttackPower attackPower = new AttackPower(20);

        Weapon weaponA = new Weapon(attackPower);
        Weapon weaponB = new Weapon(attackPower);

        weaponA.attackPower.value = 25;

        log.info("Weapon A attack power: {}", weaponA.attackPower.value);
        log.info("Weapon B attack power: {}", weaponB.attackPower.value);
    }

    private static void pp42To43() {
        log.info("damage: {}", new Damage(new Member(), new Enemy(30)).damage());
    }

    private static void p44() {
        Product product = new Product(39_800);
        log.info("price: {}", product.addPrice(19_800));
    }

}
