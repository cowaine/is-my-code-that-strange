package com.cowaine.snoopingh.chap03;

import java.util.Currency;

// 데이터와 로직은 같은 클래스에 있으면 응집도가 높아짐!
// 응집도가 낮은 구조는 중복을 발생시킨다.
public class Money {
    final int amount; // 인스턴스를 불변으로 만들어서 예상치 못한 동작 막기
    final Currency currency;

    // 생성자로 확실하게 정상적인 값 설정 - 인스턴스 변수 초기화, 유효성 검사
    Money(int amount, Currency currency) {
        // 가드 : 범위를 벗어나는 조건을 메서드 가장 앞 부분에서 확인
        if (amount < 0) {
            throw new IllegalArgumentException("금액은 0 이상의 값을 지정해 주세요.");
        }

        if (currency == null) {
            throw new IllegalArgumentException("통화 단위를 지정해 주세요.");
        }

        this.amount = amount;
        this.currency = currency;
    }

    // 계산 로직은 데이터를 가진 쪽에 구현 - 높은 응집도
//    void add(int other) {
//        amount += other;
//    }

    // 인스턴브 변수를 변경하고 싶다면 새로운 인스턴스를 만듦
//    Money add(int other) {
//    Money add(final int other) { //  매개변수도 불변으로 만듦
////        int added = amount + other;
//        final int added = amount + other; // 지역변수도 불변으로 만듦
//        return new Money(added, currency);
//    }

    // 매개변수 자료형을 Money 로 바꿔서 다른 타입은 받지 않도록 함
    Money add(final Money other) {
        if (!currency.equals(other.currency)) {
            throw new IllegalArgumentException("통화 단위가 다릅니다.");
        }

        final int added = amount + other.amount;
        return new Money(added, currency);
    }

    // 익명함수에서는 변수 재할당이 불가능
//    public void process(int value) {
//        Runnable r = new Runnable() {
//            public void run() {
//                value = 10;
//                System.out.println(value);
//            }
//        };
//        new Thread(r).start();
//    }
}
