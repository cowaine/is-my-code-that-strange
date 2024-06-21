package com.cowaine.corock.chapter04;

import com.cowaine.corock.chapter04.game.AttackPower;
import com.cowaine.corock.chapter04.game.Damage;
import com.cowaine.corock.chapter04.game.Enemy;
import com.cowaine.corock.chapter04.game.Member;
import com.cowaine.corock.chapter04.game.Weapon;
import com.cowaine.corock.chapter04.product.Product;
import lombok.extern.slf4j.Slf4j;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Slf4j
public class Book {

    public static void main(String[] args) {
        Book.pp45To48();

        AttackPower attackPower = new AttackPower(20);

        // (...)

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        final AttackPower reinforced = attackPower.reinforce(new AttackPower(15));

        Runnable disableTask = attackPower::disable;
        executorService.submit(disableTask);
        executorService.shutdown();

        try {
            if (executorService.awaitTermination(3, TimeUnit.SECONDS)) {
                log.info("Final attack power: {}", reinforced.value);
            }
        } catch (InterruptedException e) {
            log.error("Thread interrupted while waiting for ExecutorService to terminate", e);
            Thread.currentThread().interrupt();
        }
    }

    private static void pp45To47() {
        AttackPower attackPowerA = new AttackPower(20);
        AttackPower attackPowerB = new AttackPower(20);

        Weapon weaponA = new Weapon(attackPowerA);
        Weapon weaponB = new Weapon(attackPowerB);

        // weaponA.attackPower.value += 5;

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

    private static void pp45To48() {
        // Book.pp42To43();
        // Book.p44();
        // Book.pp45To47();

        AttackPower attackPower = new AttackPower(20);

        // (...)

        ExecutorService executorService = Executors.newFixedThreadPool(2);

        // Runnable reinforceTask = () -> attackPower.reinforce(15);
        Runnable disableTask = attackPower::disable;

        // executorService.submit(reinforceTask);
        executorService.submit(disableTask);

        executorService.shutdown();

        try {
            if (executorService.awaitTermination(3, TimeUnit.SECONDS)) {
                log.info("Final attack power: {}", attackPower.value);
            }
        } catch (InterruptedException e) {
            log.error("Thread interrupted while waiting for ExecutorService to terminate", e);
            Thread.currentThread().interrupt();
        }
    }

}
