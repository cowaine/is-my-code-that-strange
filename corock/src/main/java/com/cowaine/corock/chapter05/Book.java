package com.cowaine.corock.chapter05;

import com.cowaine.corock.chapter05.order.Money;
import com.cowaine.corock.chapter05.payment.PaymentManager;
import com.cowaine.corock.chapter05.point.GiftPoint;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.pp60To62();
        // Book.p62();

        // 표준 회원 가입 포인트
        // GiftPoint standardMembershipPoint = new GiftPoint(3_000);
        GiftPoint standardMembershipPoint = GiftPoint.forStandardMembership();

        // (...)

        // GiftPoint premiumMembershipPoint = new GiftPoint(10_000);
        GiftPoint premiumMembershipPoint = GiftPoint.forPremiumMembership();

        // (...)

        log.info("표준 회원 가입 포인트: {}, 프리미엄 회원 가입 포인트: {}", standardMembershipPoint, premiumMembershipPoint);
    }

    private static void pp60To62() {
        Money moneyData1 = new Money(100);
        Money moneyData2 = new Money(500);

        log.info("amount: {}", moneyData1.add(moneyData2).getAmount());
    }

    private static void p62() {
        Money moneyData1 = new Money(1_000);
        Money moneyData2 = new Money(5_000);

        PaymentManager paymentManager = new PaymentManager();
        int addedAmount = paymentManager.add(moneyData1.getAmount(), moneyData2.getAmount());
        log.info("amount: {}, discountRate: {}", addedAmount, paymentManager.getDiscountRate());
    }

}
