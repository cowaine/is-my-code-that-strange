package com.cowaine.coalong;

import com.cowaine.coalong.chapter03.Money;

import java.util.Currency;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
        System.out.println("Hello, coalong!");
    }

    void chapter03() {
        Money money = new Money(100, Currency.getInstance(Locale.KOREA));
        Money originalPrice = new Money(1000, Currency.getInstance(Locale.KOREA));
        boolean specialServiceAdded = false;
        Money additionalServiceFee = new Money(2000, Currency.getInstance(Locale.KOREA));
        Money addedMoney = money.add(originalPrice);

        if (specialServiceAdded) {
            addedMoney.add(additionalServiceFee);
        }
    }
}
