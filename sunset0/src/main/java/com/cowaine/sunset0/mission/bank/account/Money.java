package com.cowaine.sunset0.mission.bank.account;

public class Money {
    private final long amount;
    private final Currency currency;

    public Money(final long amount) {
        this(amount, Currency.WON);
    }

    public Money(final long amount, final Currency currency) {
        validateMoneyAmount(amount);
        validateMoneyCurrency(currency);
        this.amount = amount;
        this.currency = currency;
    }

    private void validateMoneyCurrency(final Currency currency) {
        if (!currency.isSupported()) {
            throw new InvalidMoneyException(
                    String.format("( %s is not supported currency.)", currency)
            );
        }
    }

    private void validateMoneyAmount(final long amount) {
        if (amount < 0L) {
            throw new InvalidMoneyException(String.format("(Money is not negative: %d)", amount));

        }
    }

    public long getAmount() {
        return amount;
    }

    public Currency getCurrency() {
        return currency;
    }

    private boolean isSameCurrency(final Money amount) {
        return this.currency.equals(amount.getCurrency());
    }

    Money add(final Money amount) {
        if (!isSameCurrency(amount)) {
            throw new DifferentCurrencyException("통화가 일치하지 않습니다.");
        }
        return new Money(this.amount + amount.getAmount(), this.currency);
    }

    Money subtract(final Money amount) {
        if (!isSameCurrency(amount)) {
            throw new DifferentCurrencyException("통화가 일치하지 않습니다.");
        }
        return new Money(this.amount - amount.getAmount(), this.currency);
    }


    @Override
    public String toString() {
        return amount + " " + currency;
    }
}
