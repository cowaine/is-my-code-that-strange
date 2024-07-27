package com.cowaine.sunset0.mission.bank.account;

public interface Account {

    Money deposit(final Money amount);

    Money withdraw(final Money amount);

    Money payInterest();
}
