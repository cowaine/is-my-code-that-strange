package com.cowaine.corock.mission.bank;

public class Money {
    private final long amount;
    private final Currency currency;

    public Money(long amount) {
        this(amount, Currency.WON);
    }

    public Money(long amount, Currency currency) {
        if (amount < 0L) {
            throw new InvalidMoneyException("(Money is not negative: " + amount + ")");
        }
        if (!isSupportedCurrency(currency)) {
            throw new InvalidMoneyException("(" + currency + " is not supported currency.)");
        }
        this.amount = amount;
        this.currency = currency;
    }

    public long getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    private boolean isSupportedCurrency(Currency currency) {
        return Currency.WON == currency || Currency.DOLLAR == currency;
    }

    private boolean isSameCurrency(Money amount) {
        return this.currency.equals(amount.getCurrency());
    }

    public Money add(Money amount) {
        if (!isSameCurrency(amount)) {
            throw new DifferentCurrencyException("통화가 일치하지 않습니다.");
        }
        return new Money(this.amount + amount.getAmount(), this.currency);
    }

    public Money subtract(Money amount) {
        if (!isSameCurrency(amount)) {
            throw new DifferentCurrencyException("통화가 일치하지 않습니다.");
        }
        return new Money(this.amount - amount.getAmount(), this.currency);
    }

    /**
     * YEN 통화는 아직 지원하지 않음
     */
    public enum Currency {
        WON, DOLLAR, YEN
    }

    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
