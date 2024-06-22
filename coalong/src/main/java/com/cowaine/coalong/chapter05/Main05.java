package com.cowaine.coalong.chapter05;

public class Main05 {
    public static void main(String[] args) {
        page61();
        page65();
    }

    private static void page65() {
        GiftPoint standardMembershipPoint = new GiftPoint(3000);
        GiftPoint premiumMembershipPoint  = new GiftPoint(10000);
    }

    private static void page61() {

        // moneyData1, moneyData2 는 데이터 클래스
        MoneyData moneyData1 = new MoneyData();
        MoneyData moneyData2 = new MoneyData();

        moneyData1.amount = OrderManager.add(moneyData1.amount, moneyData2.amount);
        System.out.println(moneyData1.amount);
    }
}
