package com.cowaine.sunset0.mission.bank.account;

public interface Account {

    public Money deposit(final Money amount);

    public Money withdraw(final Money amount);

    public Money payInterest();
}
