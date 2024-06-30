package com.cowaine.sixth.domain;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@RequiredArgsConstructor(staticName = "ofSomeMagic")
@Getter
public class Magic {

    private final String pk;
    private final String name;
    private final int mp;
    private final MagicElements magicElements;

    public static Magic ofFireBall() {
        return new Magic(UUID.randomUUID().toString(), "fire ball", 10, MagicElements.FIRE);
    }

    public static Magic ofRockDrop() {
        return new Magic(UUID.randomUUID().toString(), "rock ground", 15, MagicElements.GROUND);
    }

    public static Magic ofHolyLight() {
        return new Magic(UUID.randomUUID().toString(), "holy light", 20, MagicElements.HOLY);
    }

    public static Magic ofBlackHall() {
        return new Magic(UUID.randomUUID().toString(), "black hall", 40, MagicElements.DARK);
    }
}
