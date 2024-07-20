package com.cowaine.coalong.chpater10.game;

import com.cowaine.coalong.chapter05.game.Armor;

public class Example {
    public static void main(String[] args) {
        Member member = new Member(100);
        Accessory accessory = new Accessory();
        Armor armor = new Armor();

        int maxHitPoint = member.getMaxHitPoint() + accessory.maxHitPointIncrements();
        System.out.println("엑세서리의 최대 히트포인트 증가 효과 적용" + maxHitPoint);

        maxHitPoint = member.getMaxHitPoint() + armor.maxHitPointIncrements();
        System.out.println("최대 히트포인트 증가 효과 적용" + maxHitPoint);

        maxHitPoint = member.getMaxHitPoint() + accessory.maxHitPointIncrements() + armor.maxHitPointIncrements();
        System.out.println("최대 히트포인트 증가 관련 코드 수정" + maxHitPoint);
    }
}
