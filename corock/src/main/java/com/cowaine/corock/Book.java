package com.cowaine.corock;

import com.cowaine.corock.chapter01.contract.ContractAmount;
import com.cowaine.corock.chapter01.game.Magic;
import com.cowaine.corock.chapter01.game.Member;
import com.cowaine.corock.chapter01.game.RpgService;
import com.cowaine.corock.chapter02.game.Damage;
import com.cowaine.corock.chapter02.game.Game;
import com.cowaine.corock.chapter02.game.HitPoint;
import com.cowaine.corock.chapter03.Money;
import lombok.extern.slf4j.Slf4j;

import java.math.BigDecimal;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.Currency;
import java.util.Locale;
import java.util.stream.IntStream;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.p4();
        // Book.p10();
        // Book.pp14To17();
        // Book.p18();
        // Book.p19();
        // Book.pp26To31();
        // Book.pp32To33();
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

    private static void p19() {
        HitPoint hitPoint = new HitPoint(500);
        log.info("Player's initial HP: {}", hitPoint.getValue());

        HitPoint damagedHitPoint = hitPoint.damage(70);
        log.info("Player's HP after taking damage: {}", damagedHitPoint.getValue());

        HitPoint recoveredHitPoint = damagedHitPoint.recover(50);
        log.info("Player's HP after using a health potion: {}", recoveredHitPoint.getValue());
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
