package com.cowaine.corock.chapter06;

import com.cowaine.corock.chapter06.game.HealthCondition;
import com.cowaine.corock.chapter06.game.Member;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Book {

    public static void main(String[] args) {
        HealthCondition healthCondition = HealthCondition.from(new Member(20, 100, 0, 10, 1, 4, 4, 4));
        log.info("Member's health condition: {}", healthCondition);
    }

}
