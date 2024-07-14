package com.cowaine.corock.chapter10;

import com.cowaine.corock.chapter10.amount.SalesCommissionRate;
import com.cowaine.corock.chapter10.amount.SalesPrice;
import com.cowaine.corock.chapter10.amount.ServiceUsageFee;
import com.cowaine.corock.chapter10.game.Accessory;
import com.cowaine.corock.chapter10.game.Armor;
import com.cowaine.corock.chapter10.game.CorrectedMaxHitPoint;
import com.cowaine.corock.chapter10.game.Magic;
import com.cowaine.corock.chapter10.game.Member;
import com.cowaine.corock.chapter10.game.OriginalMaxHitPoint;
import com.cowaine.corock.chapter10.game.States;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.pp221To222();
        // Book.pp226To227();
        // Book.pp228To229();
        // Book.p230();

        Magic magic = new Magic(20);
        Member member = new Member(100, 90, 50, new States());

        log.info("Can you enchant? {}", magic.isMemberHpMoreThanZeroAndIsMemberCanActAndIsMemberMpMoreThanMagicCostMp(member));
    }

    private static void pp221To222() {
        SalesPrice salesPrice = new SalesPrice(59_900);
        SalesCommissionRate salesCommissionRate = new SalesCommissionRate(0.078);
        log.info("ServiceUsageFee: {}", ServiceUsageFee.determine(salesPrice, salesCommissionRate));
    }

    private static void pp226To227() {
        Member member = new Member(100, 85, 70, new States());
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

}
