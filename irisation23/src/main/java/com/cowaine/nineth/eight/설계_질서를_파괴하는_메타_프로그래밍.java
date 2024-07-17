package com.cowaine.nineth.eight;

import com.cowaine.nineth.eight.domain.Level;

import java.lang.reflect.Field;

public class 설계_질서를_파괴하는_메타_프로그래밍 {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Level level = Level.initialize();
        System.out.println(level.getValue());

        Field field = Level.class.getDeclaredField("value");
        field.setAccessible(true);
        field.setInt(level, 999);

        System.out.println("Level: " + level.getValue());
        
    }
}
