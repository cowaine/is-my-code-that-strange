package com.cowaine.corock.chapter07;

import com.cowaine.corock.chapter07.game.Character;
import com.cowaine.corock.chapter07.game.Item;
import lombok.extern.slf4j.Slf4j;

import java.util.List;

@Slf4j
public class Book {

    public static void main(String[] args) {
        // Book.p134();
    }

    private static void p134() {
        Character corock = new Character(List.of(new Item("감옥 열쇠")));

        log.info("감옥 열쇠 보유 여부: {}", corock.hasPrisonKey());
    }

}
