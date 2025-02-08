package com.cowaine.corock.chapter03;

import com.cowaine.corock.chapter03.domain.Money;
import lombok.extern.slf4j.Slf4j;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Currency;
import java.util.Locale;
import java.util.stream.IntStream;

@Slf4j
public class Book {

    public static void main(String[] args) throws NoSuchAlgorithmException {
        Book.pp26To31();
        Book.pp32To33();
    }

    private static void pp26To31() throws NoSuchAlgorithmException {
        Currency currency = Currency.getInstance(Locale.KOREA);
        Money money = new Money(100, currency);
        log.info("The amount of money is {}, the currency is {}", money.getAmount(), money.getCurrency());

        SecureRandom secureRandom = SecureRandom.getInstanceStrong();
        boolean specialServiceAdded = secureRandom.nextBoolean();
        int additionalServiceFee = 9_900;

        money = money.add(new Money(39_800, currency));

        // (...)

        if (specialServiceAdded) {
            money = money.add(new Money(additionalServiceFee, currency));

            // (...)

            boolean seasonOffApplied = secureRandom.nextBoolean();
            if (seasonOffApplied) {
                money = money.add(seasonPrice());
            }
        }

        log.info("The amount of changed money is {}, the currency is {}", money.getAmount(), money.getCurrency());
    }

    private static Money seasonPrice() {
        return new Money(19_800, Currency.getInstance(Locale.KOREA));
    }

    private static void pp32To33() {
        Currency currency = Currency.getInstance(Locale.KOREA);
        Money money = new Money(1_000, currency);

        // 티켓의 수
        final int ticketCount = 3;
        Money addedMoney = IntStream.range(0, ticketCount)
                .mapToObj(v -> new Money(12_000, currency))
                .reduce(money, Money::add);
        log.info("Added money: {}", addedMoney.getAmount());
    }

}
