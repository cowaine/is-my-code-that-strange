package com.cowaine.corock.chapter11;

import com.cowaine.corock.chapter11.game.Face;
import com.cowaine.corock.chapter11.game.Member;
import com.cowaine.corock.chapter11.game.States;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.pp252To253();

        Member member = new Member(new States());

        // 수면, 마비, 혼란, 석화, 사망 이외의 상황에서 행동 가능
        boolean mystery = member.isNotSleepingAndIsNotParalyzedAndIsNotConfusedAndIsNotStoneAndIsNotDead();

        log.info("Can act? {}", mystery);
    }

    private static void pp252To253() {
        Face face = new Face();
        Member member = new Member(new States());

        // 중독, 마비 상태에서 멤버의 표정을 변화시킴
        if (member.isPainful()) {
            face.changeToPainful();
        }
    }

}
