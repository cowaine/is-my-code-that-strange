package com.cowaine.corock.chapter01;

import com.cowaine.corock.chapter01.contract.ContractAmount;
import com.cowaine.corock.chapter01.game.Magic;
import com.cowaine.corock.chapter01.game.Member;
import com.cowaine.corock.chapter01.game.RpgService;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;

@Slf4j
public class Book {

    public static void main(String[] args) {
        Book.p4();
        Book.p10();
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

}
