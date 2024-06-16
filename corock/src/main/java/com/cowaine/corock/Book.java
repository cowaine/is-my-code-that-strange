package com.cowaine.corock;

import com.cowaine.corock.chapter01.contract.ContractAmount;
import com.cowaine.corock.chapter01.game.Magic;
import com.cowaine.corock.chapter01.game.Member;
import com.cowaine.corock.chapter01.game.RpgService;
import com.cowaine.corock.chapter02.game.Damage;
import com.cowaine.corock.chapter02.game.Game;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.p4();
        // Book.p10();
        // Book.pp14To17();
        // Book.p18();
    }

    private static void p4() {
        RpgService rpgService = new RpgService();
        Member member = new Member(10, 35);
        Magic magic = new Magic(25);

        rpgService.cast(member, magic);
    }

    private static void p10() {
        int amountIncludingTax = 0;
        BigDecimal salesTaxRate = new BigDecimal("-0.1");
        ContractAmount amount = new ContractAmount(amountIncludingTax, salesTaxRate);
        log.info("salesTaxRate: {}", amount.getSalesTaxRate());
    }

    private static void pp14To17() {
        Damage damage = new Damage();
        log.info("damage: {}", damage.calculate(40, 30, 20, 10));
    }

    private static void p18() {
        Game game = new Game();
        game.play(70, 50);
    }

}
