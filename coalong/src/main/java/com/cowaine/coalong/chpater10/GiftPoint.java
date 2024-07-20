package com.cowaine.coalong.chpater10;

import lombok.Getter;
import lombok.RequiredArgsConstructor;


@RequiredArgsConstructor
@Getter
public class GiftPoint {
    private final int point;

    public GiftPoint add(GiftPoint giftPoint) {
        return new GiftPoint(this.point + giftPoint.getPoint());
    }
}
