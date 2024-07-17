package com.cowaine.nineth.three;

public class ComicManager {
    static int value = 40;
    boolean isOk() {
        return 60 <= value;
    }

    void tryConsume() {
        int tmp = value - 60;

        if(tmp < 0) {
            throw new RuntimeException();
        }

        value = tmp;
    }
}
