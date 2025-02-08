package com.cowaine.corock.chapter09.webtoon;

class ComicManager {

    int value;

    // (...)

    boolean isOk() {
        return 60 <= value;
    }

    void tryConsume() {
        int tmp = value - 60;
        if (tmp < 0) {
            throw new RuntimeException();
        }
        this.value = tmp;
    }

}
