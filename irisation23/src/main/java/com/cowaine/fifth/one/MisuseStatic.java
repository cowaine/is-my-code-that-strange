package com.cowaine.fifth.one;

// 5.1 static 메서드의 오용
public class MisuseStatic {
}

// 주문을 관리하는 클래스
class OrderManager {
    static int add(int moneyAmount1, int moneyAmount2) {
        return moneyAmount1 + moneyAmount2;
    }
}

// 코드 5.3 인스턴스 메서드인 척하는 add 메서드
class PaymentManager {
    private int discountRate; // 할인율

    int add(int moneyAmount1, int moneyAmount2) {
        return moneyAmount1 + moneyAmount2;
    }
}
