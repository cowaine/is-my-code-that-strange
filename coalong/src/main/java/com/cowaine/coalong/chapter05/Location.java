package com.cowaine.coalong.chapter05;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class Location {
    final int x;
    final int y;

    Location shift(final int shiftX, final int shiftY) {
        final int nextX = x + shiftX;
        final int nextY = y + shiftY;
        return new Location(nextX, nextY);
    }
}
