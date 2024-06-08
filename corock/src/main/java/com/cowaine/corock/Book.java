package com.cowaine.corock;

import com.cowaine.corock.chapter01.contract.ContractAmount;
import com.cowaine.corock.chapter01.game.Magic;
import com.cowaine.corock.chapter01.game.Member;
import com.cowaine.corock.chapter01.game.RpgService;

public class Book {

    public static void main(String[] args) {
        // Book.p4();

        ContractAmount amount = new ContractAmount();
        System.out.println(amount.salesTaxRate.toString());
    }

    private static void p4() {
        RpgService rpgService = new RpgService();
        Member member = new Member(10, 35);
        Magic magic = new Magic(25);

        rpgService.cast(member, magic);
    }

}
