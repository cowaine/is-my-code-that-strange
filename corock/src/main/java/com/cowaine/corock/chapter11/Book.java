package com.cowaine.corock.chapter11;

import com.cowaine.corock.chapter11.game.Face;
import com.cowaine.corock.chapter11.game.Member;
import com.cowaine.corock.chapter11.game.States;
import lombok.extern.slf4j.Slf4j;

import java.util.Collections;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.pp252To253();
        // Book.pp254To256();
    }

    private static void pp252To253() {
        Face face = new Face();
        Member member = new Member(new States(Collections.emptyList()));

        // 중독, 마비 상태에서 멤버의 표정을 변화시킴
        if (member.isPainful()) {
            face.changeToPainful();
        }
    }

    private static void pp254To256() {
        Member member = new Member(new States(Collections.emptyList()));
        log.info("Can act? {}", member.canAct());
    }

}
