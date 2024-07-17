package com.cowaine.coalong.chapter09;

public class ComicManager {
    boolean isOk(int value) {
        return 60 <= value;
    }

    void tryConsume(int value) {
        int tmp = value - 60;
        if (tmp < 0) {
            throw new RuntimeException();
        }
        value = tmp;
    }
}
