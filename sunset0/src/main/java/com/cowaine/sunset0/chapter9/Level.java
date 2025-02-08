package com.cowaine.sunset0.chapter9;

import java.lang.reflect.Field;

//9.16 멤버 레벨을 나타내는 클래스
public class Level {

    private static final int MIN = 1;
    private static final int MAX = 99;
    private final int value;

    private Level(final int value) {
        if (value < MIN || MAX < value) {
            throw new RuntimeException();
        }
        this.value = value;
    }

    static Level initialize() {
        return new Level(MIN);
    }

    Level increase() {
        if (value < MAX) {
            return new Level(value + 1);
        }
        return this;
    }

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Level level = Level.initialize();
        System.out.println("level.value = " + level.value);

        //리플랙션으로 값 변경
        Field field = Level.class.getDeclaredField("value");
        field.setAccessible(true);
        field.setInt(level, 999);
        System.out.println("level.value = " + level.value);
    }
}
