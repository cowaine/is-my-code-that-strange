package com.cowaine.corock.chapter05;

import com.cowaine.corock.chapter05.order.Money;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        Money moneyData1 = new Money(100);
        Money moneyData2 = new Money(500);

        log.info("money: {}", moneyData1.add(moneyData2).getAmount());
    }

}
