package com.cowaine.corock.chapter09.game;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Member {

    private int level;

    private Equipment head;
    private Equipment body;
    private Equipment arm;
    private int defense;

    // (...)

    void init() {
        if (level > 99) {
            level = 99;
        }

        if (level == 1) {
            // 멤버의 히트 포인트와 장비 등을 초기화
            initHitPoint();
            initMagicPoint();
            initEquipments();
        } else if (level == 100) {
            // 레벨 100 보너스로 고유의 특별한 능력을 부여
            addSpecialAbility();
        }
    }

    private void initHitPoint() {
        // (...)
    }

    private void initMagicPoint() {
        // (...)
    }

    private void initEquipments() {
        // (...)
    }

    private void addSpecialAbility() {
        // (...)
    }

    // 방어구의 방어력과 캐릭터의 방어력을 합산해서 반환
    int totalDefense() {
        int total = defense;

        if (head != null) {
            total += head.getDefense();
        }

        if (body != null) {
            total += body.getDefense();
        }

        if (arm != null) {
            total += arm.getDefense();
        }

        return total;
    }

    // 모든 방어구 장비 해제
    void takeOffAllEquipments() {
        head = null;
        body = null;
        arm = null;
    }

    // 방어구 출력하기
    public void showBodyEquipment() {
        showParam(body.getName());
        showParam(String.valueOf(body.getDefense()));
        showParam(String.valueOf(body.getMagicDefense()));
    }

    private void showParam(String param) {
        log.info("{}", param);
    }

}
