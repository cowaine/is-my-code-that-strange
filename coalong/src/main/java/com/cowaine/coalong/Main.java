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
        int originalPrice = 1000;
        money.amount = originalPrice;
        boolean specialServiceAdded = false;
        int additionalServiceFee = 0;

        if(specialServiceAdded) {
            money.add(additionalServiceFee);
        }
    }
}
