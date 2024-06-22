package com.cowaine.corock.chapter05.game;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Location {

    final int x;
    final int y;

    /**
     * 게임 캐릭터 위치를 이동한다.
     *
     * @param location 이동 대상의 위치
     * @param shiftX   x 축으로 이동할 거리
     * @param shiftY   y 축으로 이동할 거리
     * @return 이동한 위치
     */
    Location shift(Location location, int shiftX, int shiftY) {
        final int nextX = x + shiftX;
        final int nextY = y + shiftY;

        return new Location(nextX, nextY);
    }

}
