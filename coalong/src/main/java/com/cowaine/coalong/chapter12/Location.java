package com.cowaine.coalong.chapter12;

// 위치를 나타내는 클래스
public class Location {
    private final int x;
    private final int y;

    Location(final int x, final int y) {
        if (!valid(x, y)) {
            throw new IllegalArgumentException("잘못된 위치입니다.");
        }
        this.x = x;
        this.y = y;
    }

    //위치 이동하기
    Location shift(final int shiftX, final int shiftY) {
        int nextX = x + shiftX;
        int nextY = y + shiftY;

        return new Location(nextX, nextY);
    }

    private boolean valid(int nextX, int nextY) {
        return true;
    }
}
