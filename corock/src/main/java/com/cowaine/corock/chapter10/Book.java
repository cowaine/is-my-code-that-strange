package com.cowaine.corock.chapter10;

import com.cowaine.corock.chapter10.amount.SalesCommissionRate;
import com.cowaine.corock.chapter10.amount.SalesPrice;
import com.cowaine.corock.chapter10.amount.ServiceUsageFee;
import com.cowaine.corock.chapter10.game.Accessory;
import com.cowaine.corock.chapter10.game.Armor;
import com.cowaine.corock.chapter10.game.CorrectedMaxHitPoint;
import com.cowaine.corock.chapter10.game.Member;
import com.cowaine.corock.chapter10.game.OriginalMaxHitPoint;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.pp221To222();
        // Book.pp226To227();

        OriginalMaxHitPoint originalMaxHitPoint = new OriginalMaxHitPoint(85);
        log.info("original max HP: {}", originalMaxHitPoint);

        Accessory accessory = new Accessory();
        Armor armor = new Armor();
        CorrectedMaxHitPoint correctedMaxHitPoint = new CorrectedMaxHitPoint(originalMaxHitPoint, accessory, armor);
        log.info("corrected max HP: {}", correctedMaxHitPoint);
    }

    private static void pp221To222() {
        SalesPrice salesPrice = new SalesPrice(59_900);
        SalesCommissionRate salesCommissionRate = new SalesCommissionRate(0.078);
        log.info("ServiceUsageFee: {}", ServiceUsageFee.determine(salesPrice, salesCommissionRate));
    }

    private static void pp226To227() {
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

}
