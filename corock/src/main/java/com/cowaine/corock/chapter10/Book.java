package com.cowaine.corock.chapter10;

import com.cowaine.corock.chapter10.amount.SalesCommissionRate;
import com.cowaine.corock.chapter10.amount.SalesPrice;
import com.cowaine.corock.chapter10.amount.ServiceUsageFee;
import com.cowaine.corock.chapter10.common.StateType;
import com.cowaine.corock.chapter10.game.Accessory;
import com.cowaine.corock.chapter10.game.Armor;
import com.cowaine.corock.chapter10.game.CorrectedMaxHitPoint;
import com.cowaine.corock.chapter10.game.Magic;
import com.cowaine.corock.chapter10.game.Member;
import com.cowaine.corock.chapter10.game.OriginalMaxHitPoint;
import com.cowaine.corock.chapter10.game.States;
import com.cowaine.corock.chapter10.order.GiftPoint;
import com.cowaine.corock.chapter10.order.Items;
import com.cowaine.corock.chapter10.order.Order;
import com.cowaine.corock.chapter10.order.OrderId;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;
import java.util.List;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.pp221To222();
        // Book.pp226To227();
        // Book.pp228To229();
        // Book.p230();
        // Book.p232();
        // Book.pp232To233();
        // Book.pp233To234();
        // Book.pp247To249();

        int brFee = 26_000;
        int LRF = 100;
        int dod = 18;

        // 렌탈 요금 총액 = 기본 요금 + 연체료 * 연체 일
        int trFee = brFee + LRF * dod;
        log.info("렌탈 요금 총액: {}", trFee);
    }

    private static void pp221To222() {
        SalesPrice salesPrice = new SalesPrice(59_900);
        SalesCommissionRate salesCommissionRate = new SalesCommissionRate(0.078);
        log.info("ServiceUsageFee: {}", ServiceUsageFee.determine(salesPrice, salesCommissionRate));
    }

    private static void pp226To227() {
        Member member = new Member(100, 85, 70, new States(Collections.emptyList()));
        Accessory accessory = new Accessory();

        int maxHitPoint = member.getMaxHitPoint() + accessory.maxHitPointIncrements();
        log.info("Max HP: {}", maxHitPoint);

        Armor armor = new Armor();
        maxHitPoint = member.getMaxHitPoint() + armor.maxHitPointIncrements();
        log.info("Max HP: {} (x)", maxHitPoint);

        maxHitPoint = member.getMaxHitPoint() + accessory.maxHitPointIncrements() + armor.maxHitPointIncrements();
        log.info("Max HP: {} (o)", maxHitPoint);
    }

    private static void pp228To229() {
        OriginalMaxHitPoint originalMaxHitPoint = new OriginalMaxHitPoint(85);
        log.info("original max HP: {}", originalMaxHitPoint);

        Accessory accessory = new Accessory();
        Armor armor = new Armor();
        CorrectedMaxHitPoint correctedMaxHitPoint = new CorrectedMaxHitPoint(originalMaxHitPoint, accessory, armor);
        log.info("corrected max HP: {}", correctedMaxHitPoint);
    }

    private static int p230() {
        int tmp1 = 1;
        int tmp2 = 2;
        int tmp4 = 3;
        int tmp6 = 4;

        int tmp3 = tmp1 - tmp2;
        if (tmp3 < tmp4) {
            tmp3 = tmp4;
        }
        int tmp5 = tmp3 * tmp6;
        return tmp5;
    }

    private static void p232() {
        Magic magic = new Magic(20);
        Member member = new Member(100, 90, 50, new States(Collections.emptyList()));

        log.info("Can you enchant? {}",
                magic.isMemberHpMoreThanZeroAndIsMemberCanActAndIsMemberMpMoreThanMagicCostMp(member));
    }

    private static void pp232To233() {
        Magic magic = new Magic(20);
        Member member = new Member(100, 90, 50, new States(Collections.emptyList()));

        log.info("Can you enchant? {}", magic.canEnchant(member));
    }

    private static void pp233To234() {
        Order order = new Order(new OrderId(), new Items(), new GiftPoint(0));
        int count = order.itemCount();
        log.info("Order count: {}, and gift point: {}", count, order.getGiftPoint());
    }

    private static void pp247To249() {
        Member member = new Member(999, 500, 200, new States(List.of(StateType.CONFUSED)));
        log.info("Is Member in confusion? {}", member.isInConfusion());
    }

}
