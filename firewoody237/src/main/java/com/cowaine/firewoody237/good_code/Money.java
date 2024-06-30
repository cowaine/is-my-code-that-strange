package com.cowaine.firewoody237.good_code;

import java.util.Currency;
import java.util.Locale;

public class Money {
    // 불변 변수를 활용 해 사이드이펙트를 줄인다.
    private final int amount;
    private final Currency currency;

    // 적절한 초기화 로직을 생성자에 구현한다.
    public Money(int amount, Currency currency) {
        // 잘못된 값이 입력되지 않도록 유효성 검사를 해야 한다.(가드 코드)
        if (amount < 0) {
            throw new IllegalArgumentException("금액은 0이상이어야 합니다.");
        }

        if (currency == null) {
            throw new IllegalArgumentException("통화 단위를 지정해 주세요.");
        }

        this.amount = amount;
        this.currency = currency;
    }

    public Money(int amount) {
        this.amount = amount;
        currency = Currency.getInstance(Locale.KOREA);
    }

    // 계산로직을 클래스 내부에 두어 '응집도'를 높인다.
    // 변경하고 싶다면, 인스턴스의 내용을 변경하지 말고 새로운 인스턴스를 만든다. (불변 활용)
    // 값이 중간에 바뀌면 값의 변화를 추적하기 어렵기에, 매개 변수를 불변으로 만든다.
    // 엉뚱한 값이 전달되지 않도록, primitive타입 보다 확실한 자료형을 넣는다.
    Money add(final Money other) {
        // 가드 코드
        if (!currency.equals(other.currency)) {
            throw new IllegalArgumentException("통화 단위가 상이합니다.");
        }

        // 값이 중간에 바뀌면 값의 변화를 추적하기 어렵기에, 지역 변수를 불변으로 만든다.
        final int added = amount + other.amount;
        return new Money(added, currency);
    }

    // 의미없는 메서드를 추가하지 않는다.
    // 지금 사용하지 않는 코드를 '선의'로 만들지 않는다.
//    Money multiply(final Money other) {
//        if (!currency.equals(other.currency)) {
//            throw new IllegalArgumentException("통화 단위가 상이합니다.");
//        }
//
//        final int multiplied = amount * other.amount;
//        return new Money(multiplied, currency);
//    }
}
