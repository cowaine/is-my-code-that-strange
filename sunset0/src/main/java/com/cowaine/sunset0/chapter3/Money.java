package com.cowaine.sunset0.chapter3;


import java.util.Currency;

public class Money {
    final int amount;
    final Currency currency;

    //생성자에서 유효성 검사하기
    Money (final int amount, final Currency currency) throws IllegalAccessException {
        if (amount < 0) {
            throw new IllegalAccessException("금액은 0 이상의 값을 지정해 주세요.");
        }
        if (currency == null) {
            throw new NullPointerException("통화 단위를 지정해 주세요. ");
        }
        this.amount = amount;
        this.currency = currency;
    }

    //Money 클래스에 금액을 추가하는 메서드 만들기
    Money add (final Money other) throws IllegalAccessException {
        if (!currency.equals(other.currency)) {
            throw new IllegalAccessException("통화 단위가 다릅니다.");
        }
        final int added = this.amount + other.amount;
        return new Money(added, currency); //변경할 때는 새로운 인스턴스를 만들자.
    }
}
