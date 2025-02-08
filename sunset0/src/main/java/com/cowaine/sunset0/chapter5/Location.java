package com.cowaine.sunset0.chapter5;

public class Location {

    final int x;
    final int y;

    public Location(final int x, final int y) {
        this.x = x;
        this.y = y;
    }

    Location shift(ActorManager.Location location, int shiftX, int shiftY) {
        final int nextX = x + shiftX;
        final int nextY = y + shiftY;
        return new Location(nextX, nextY);
    }
}
