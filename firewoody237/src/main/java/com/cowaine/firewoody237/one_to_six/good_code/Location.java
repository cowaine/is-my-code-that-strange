package com.cowaine.firewoody237.one_to_six.good_code;

public class Location {
    final int x;
    final int y;

    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    Location shift(final int shiftX, final int shiftY) {
        final int nextX = x + shiftX;
        final int nextY = y + shiftY;
        return new Location(nextX, nextY);
    }
}
