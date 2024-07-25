package com.cowaine.corock.chapter12.domain;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;

// 위치를 나타내는 클래스
@AllArgsConstructor(access = AccessLevel.PACKAGE)
public class Location {

    private final int x;
    private final int y;

    // (...)

    // 위치 이동하기
    Location shift(final int shiftX, final int shiftY) {
        int nextX = x + shiftX;
        int nextY = y + shiftY;
        if (valid(nextX, nextY)) {
            return new Location(nextX, nextY);
        }
        // (-1. -1)은 오류 값
        return new Location(-1, -1);
    }

    private boolean valid(int nextX, int nextY) {
        return false;
    }

}
