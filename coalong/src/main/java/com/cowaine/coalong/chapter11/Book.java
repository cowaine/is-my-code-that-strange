package com.cowaine.coalong.chapter11;


import com.cowaine.coalong.chapter07.StateType;

import java.util.List;

public class Book {
    public static void main(String[] args) {
        Book.page252();
    }

    private static void page252() {
        Member member = new Member(new States(List.of(StateType.poison)));
        Face face = new Face();
        // 중독, 마비 상태에서 멤버의 표정을 변화시킴.
        if (member.isPainful()) {
            face.changeToPainful();
        }
    }
}
