package com.cowaine.sunset0.chapter10;

//10.6 장비 착용으로 높아진 최대 히트 포인트를 나타내는 클래스
public class CorrectedMaxHitPoint {
    final int value;

    public CorrectedMaxHitPoint(final OriginalMaxPoint originalMaxPoint, final Accessory accessory, final Armor armor) {
        value = originalMaxPoint.value + accessory.maxHitPointIncrements() + armor.maxHitPointIncrements();
    }

    public static class Accessory {
        public int maxHitPointIncrements() {
            return 100;
        }
    }

    public static class Armor {
        public int maxHitPointIncrements() {
            return 100;
        }
    }
}
