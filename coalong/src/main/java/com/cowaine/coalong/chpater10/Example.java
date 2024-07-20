package com.cowaine.coalong.chpater10;

import com.cowaine.coalong.chapter05.game.Armor;
import com.cowaine.coalong.chpater10.game.Accessory;
import com.cowaine.coalong.chpater10.game.Member;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Example {
    public static void main(String[] args) {
        Example.tenDotThree();
        Example.tenDotFour();
    }

    static void tenDotThree() {
        Member member = new Member(100);
        Accessory accessory = new Accessory();
        Armor armor = new Armor(10);

        int maxHitPoint = member.getMaxHitPoint() + accessory.maxHitPointIncrements();
        log.info("엑세서리의 최대 히트포인트 증가 효과 적용{}", maxHitPoint);

        maxHitPoint = member.getMaxHitPoint() + armor.getMaxHitPoint();
        log.info("최대 히트포인트 증가 효과 적용{}", maxHitPoint);

        maxHitPoint = member.getMaxHitPoint() + accessory.maxHitPointIncrements() + armor.getMaxHitPoint();
        log.info("최대 히트포인트 증가 관련 코드 수정{}", maxHitPoint);
    }

    private static void tenDotFour() {

        int tmp1 = 1;
        int tmp2 = 2;
        int tmp3 = tmp1 - tmp2;
        int tmp4 = 4;
        int tmp6 = 6;

        if (tmp3 < tmp4) {
            tmp3 = tmp4;
        }
        int tmp5 = tmp3 * tmp6;
        log.info(String.valueOf(tmp5));
    }
}
