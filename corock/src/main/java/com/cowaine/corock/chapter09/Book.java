package com.cowaine.corock.chapter09;

import com.cowaine.corock.chapter09.game.Level;
import com.cowaine.corock.chapter09.game.Member;
import lombok.extern.slf4j.Slf4j;

import java.lang.reflect.Field;

@Slf4j
public class Book {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // Book.p191();
        // Book.pp194To197();

        Level level = Level.initialize();
        log.info("Level: {}", level.getValue());

        Field field = Level.class.getDeclaredField("value");
        field.setAccessible(true);
        field.setInt(level, 999);

        log.info("Level: {}", level.getValue());
    }

    private static void p191() {
        // 레이블 문자열, 표시 색(RGB), 최대 문자 수
        String title = "타이틀,255,250,240,64";
    }

    private static void pp194To197() {
        Member member = new Member();
        member.showBodyEquipment();
    }

}
