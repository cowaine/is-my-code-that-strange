package com.cowaine.sunset0.chapter5;



//5.14 매개변수를 변경하고 있음
public class ActorManager {
    void shift(Location location, int shiftX, int shiftY) {
        location.x += shiftX;
        location.y += shiftY;
    }

    class Location{
        int x;
        int y;
    }
}
