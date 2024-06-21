package com.cowaine.corock.chapter05;

import com.cowaine.corock.chapter05.order.Money;
import com.cowaine.corock.chapter05.payment.PaymentManager;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.pp60To62();

        Money moneyData1 = new Money(1_000);
        Money moneyData2 = new Money(5_000);

        PaymentManager paymentManager = new PaymentManager();
        int addedAmount = paymentManager.add(moneyData1.getAmount(), moneyData2.getAmount());
        log.info("amount: {}, discountRate: {}", addedAmount, paymentManager.getDiscountRate());
    }

    private static void pp60To62() {
        Money moneyData1 = new Money(100);
        Money moneyData2 = new Money(500);

        log.info("amount: {}", moneyData1.add(moneyData2).getAmount());
    }

}
