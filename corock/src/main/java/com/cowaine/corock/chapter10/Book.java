package com.cowaine.corock.chapter10;

import com.cowaine.corock.chapter10.amount.SalesCommissionRate;
import com.cowaine.corock.chapter10.amount.SalesPrice;
import com.cowaine.corock.chapter10.amount.ServiceUsageFee;
import com.cowaine.corock.chapter10.game.Accessory;
import com.cowaine.corock.chapter10.game.Armor;
import com.cowaine.corock.chapter10.game.Member;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.pp221To222();

        Member member = new Member(85);
        Accessory accessory = new Accessory();

        int maxHitPoint = member.getMaxHitPoint() + accessory.maxHitPointIncrements();
        log.info("Max HP: {}", maxHitPoint);

        Armor armor = new Armor();
        maxHitPoint = member.getMaxHitPoint() + armor.maxHitPointIncrements();
        log.info("Max HP: {} (x)", maxHitPoint);

        maxHitPoint = member.getMaxHitPoint() + accessory.maxHitPointIncrements() + armor.maxHitPointIncrements();
        log.info("Max HP: {} (o)", maxHitPoint);
    }

    private static void pp221To222() {
        SalesPrice salesPrice = new SalesPrice(59_900);
        SalesCommissionRate salesCommissionRate = new SalesCommissionRate(0.078);
        log.info("ServiceUsageFee: {}", ServiceUsageFee.determine(salesPrice, salesCommissionRate));
    }

}
