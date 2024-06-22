package com.cowaine.corock.chapter05.game;

public class SpecialAttackManager {

    void shift(Location location, int shiftX, int shiftY) {
        location.x += shiftX;
        location.y += shiftY;
    }

}
