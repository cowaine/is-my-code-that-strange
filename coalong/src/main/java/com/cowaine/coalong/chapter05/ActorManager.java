package com.cowaine.coalong.chapter05;

public class ActorManager {
    // 게임 캐릭터 위치를 이동
    void shift(Location location, int shiftX, int shiftY) {
        location.x += shiftX;
        location.y += shiftY;
    }
}
