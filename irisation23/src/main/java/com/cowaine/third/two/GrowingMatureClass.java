package com.cowaine.third.two;

import java.util.Currency;
import java.util.Locale;

/**
 * 3.2 성숙한 클래스로 성장시키는 설계 기법
 */
public class GrowingMatureClass {

    public static void main(String[] args) {
        // 코드 3.3 잘못된 값이 전달되어 버린 경우
        Money money = new Money(-100, null);

        // 코드 3.8 재할당 불가능한 코드
        Currency won = Currency.getInstance(Locale.KOREA);
        Money money1 = new Money(100, won);
        // money1.amount = -200; 재할당 불가능으로 인한 컴파일 오류

    }
}

class Money {
    //final을 붙여 불변 변수로 만들기
    final int amount; // 금액
    final Currency currency; // 통화 단위

    // 코드 3.2 생성자에서 초기화하기
    Money(int amount, Currency currency) {
        if (amount < 0) {
            throw new IllegalArgumentException("금액은 0 이상의 값을 지정 해주세요.");
        }

        if (currency == null) {
            throw new NullPointerException("통화 단위를 지정해 주세요.");
        }

        this.amount = amount;
        this.currency = currency;
    }

    // 코드 3.9 변경된 값을 가진 인스턴스 생성하기, 코드 3.12 add 메서드의 매개변수도 final로 만들기
    Money add(final int other) {
        final int added = amount + other;

        return new Money(added, currency);
    }

    // 코드 3.15 Money 자료형만 받도록 메서드 수정, 코드 3.16 add 메서드를 추가로 개선하기 | 오버로딩 사용
    Money add(final Money other) {
        if (!currency.equals(other.currency)) {
            throw new IllegalArgumentException("통화 단위가 다릅니다.");
        }

        final int added = amount + other.amount;

        return new Money(added, currency);
    }

    // 코드 3.6 인스턴스 변수를 계속해서 변경하는 경우
    void tooDifficultUnderstandMethod(Money money, int originalPrice, boolean specialServiceAdded, boolean seasonOffApplied) {
        // money.amount = originalPrice;

        int additionalServiceFee = 0;

        if (specialServiceAdded) {
            money.add(additionalServiceFee);

            // 생략
            if (seasonOffApplied) {
                // money.amount = seasonPrice();
            }
        }
    }

    private int seasonPrice() {
        return 0;
    }
}
