package com.cowaine.sunset0.chapter5;

//5.1 static 메서드 오용
public class OrderManager {

    static int add(int moneyAmount1, int moneyAmount2) {
        return moneyAmount1 + moneyAmount2;
    }

    public static void main(String[] args) {
        MoneyAmount moneyAmount1 = new MoneyAmount();
        MoneyAmount moneyAmount2 = new MoneyAmount();

        moneyAmount1.amount = OrderManager.add(moneyAmount1.amount, moneyAmount2.amount);
    }

    public static class MoneyAmount {
        int amount;

    }
}
