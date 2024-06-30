package com.cowaine.corock.chapter07;

import com.cowaine.corock.chapter07.game.Character;
import com.cowaine.corock.chapter07.game.Item;
import com.cowaine.corock.chapter07.game.Member;
import com.cowaine.corock.chapter07.game.Party;
import com.cowaine.corock.chapter07.game.StateType;
import com.cowaine.corock.chapter07.game.States;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.p134();
        // Book.pp144To145();
    }

    private static void p134() {
        Character corock = new Character(List.of(new Item("감옥 열쇠")));

        log.info("감옥 열쇠 보유 여부: {}", corock.hasPrisonKey());
    }

    private static void pp144To145() {
        List<Member> members;
        Party party = new Party();
        Member newMember = new Member(100, new States(List.of(StateType.ALIVE)), 1);

        // (...)

        members = party.members();
        members.add(newMember);

        // (...)

        members.clear();

        log.info("members: {}", members);
    }

}
