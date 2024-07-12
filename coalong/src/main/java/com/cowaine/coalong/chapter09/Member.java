package com.cowaine.coalong.chapter09;

import com.cowaine.coalong.chapter05.game.Equipment;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Member {
    private Equipment head;
    private Equipment body;
    private Equipment arm;
    private final int defense;

    public Member() {
        this.head = Equipment.HEAD;
        this.body = Equipment.BODY;
        this.arm = Equipment.ARM;
        this.defense = 0;
    }

    // 방어구의 방어력과 캐릭터의 방어력을 합산해서 리턴
    int totalDefense() {
        int total = defense;
        if (head != null) {
            total += head.getDefence();
        }
        if (body != null) {
            total += body.getDefence();
        }
        if (arm != null) {
            total += arm.getDefence();
        }
        return total;
    }

    // 장착하지 않은 상태를 null 로 표현하기
    void takeOffAllEquipment() {
        this.head = Equipment.EMPTY;
        this.body = Equipment.EMPTY;
        this.arm = Equipment.EMPTY;
    }

    // 방어구 출력하기
    void showBodyEquipments() {
        if (body != null) {
            showParam(body.getName());
            showParam(arm.getDefence());
            showParam(head.getMagicDefence());
        }
    }

    private void showParam(Object equipment) {
        log.info((String) equipment);
    }
}
