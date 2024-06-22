package com.cowaine.corock.chapter05.game;

public class ActorManager {

    /**
     * 게임 캐릭터 위치를 이동한다.
     *
     * @param location 이동 대상의 위치
     * @param shiftX   x 축으로 이동할 거리
     * @param shiftY   y 축으로 이동할 거리
     */
    void shift(Location location, int shiftX, int shiftY) {
        location.x += shiftX;
        location.y += shiftY;
    }

}
