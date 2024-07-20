package com.cowaine.corock.chapter11;

import com.cowaine.corock.chapter11.game.Face;
import com.cowaine.corock.chapter11.game.Member;
import com.cowaine.corock.chapter11.game.States;

public class Book {

    public static void main(String[] args) {
        Face face = new Face();
        Member member = new Member(new States());

        // 중독, 마비 상태에서 멤버의 표정을 변화시킴
        if (member.isPainful()) {
            face.changeToPainful();
        }
    }

}
