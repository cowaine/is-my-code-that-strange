package com.cowaine.fourth.one;

// 4.1 재할당
public class Reallocation {
}

class Test {
    private static final int MAX_TOTAL_PRICE = 10000000;

    // 4.1.1 불변 변수를 만들어서 재할당 막기
    int damage() {
        final int basicAttackPower = 12;
        final int finalAttackDamage = basicAttackPower + 10;
        final int reduction = finalAttackDamage / 2;
        final int damage = Math.max(0, 11 - reduction);

        return damage;
    }

    // 4.1.2 매개변수에 final을 붙여 불변으로 만들기
    void addPrice(final int productPrice) {
        final int increasedTotalPrice = 2300 + 3000;

        if (MAX_TOTAL_PRICE < increasedTotalPrice) {
            throw new IllegalArgumentException("구매 상한 금액을 넘었습니다.");
        }
    }
}