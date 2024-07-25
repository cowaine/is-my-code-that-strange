package com.cowaine.corock.chapter12.domain;

public class Point {

    private int point;

    @Deprecated(forRemoval = true)
    int gainAndGetPoint() {
        point += 10;
        return point;
    }

    /**
     * 포인트를 증가(커맨드)
     */
    void gainPoint() {
        point += 10;
    }

    /**
     * 포인트를 반환(쿼리)
     */
    int getPoint() {
        return point;
    }

}
