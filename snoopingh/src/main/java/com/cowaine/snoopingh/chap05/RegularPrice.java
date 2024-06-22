package com.cowaine.snoopingh.chap05;

// 기본 자료형으로만 구현하면, 중복 코드가 많이 생기고 계산 로직이 이곳저곳에 분산되기 쉽다.
// 클래스를 많이 만드는 것이 오히려 낫다

/** 정가 */
public class RegularPrice {
    final int amount;

    RegularPrice(final int amount) {
        if (amount < 0) {
            throw new IllegalArgumentException();
        }

        this.amount = amount;
    }
}
