package com.cowaine.sunset0.chapter9;

//9.2 매직 넘버
public class ComicManager {
    private int value;

    boolean isOk() {
        return 60 <= value;
    }

    void tryConsume() {
        int tmp = value - 60;
        if (tmp < 0) {
            throw new RuntimeException();
        }
        value = tmp;
    }
}
