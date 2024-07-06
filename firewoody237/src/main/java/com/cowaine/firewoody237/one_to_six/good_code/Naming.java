package com.cowaine.firewoody237.one_to_six.good_code;

public class Naming {

    // 관련 데이터를 모은 클래스
    public static class HitPoint {
        private static final int MIN = 0;
        private static final int MAX = 999;
        private final int value;

        public HitPoint(int value) {
            if (value < MIN) {
                throw new IllegalArgumentException("최소치보다 낮습니다.");
            }

            if (value > MAX) {
                throw new IllegalArgumentException("최대치보다 높습니다.");
            }

            this.value = value;
        }

        public HitPoint damage(final int damageAmount) {
            final int damaged = value - damageAmount; // 의도를 알기 쉬운 이름
            final int corrected = damaged < MIN ? MIN : damaged; // 목적별로 변수를 따로 만듦
            return new HitPoint(corrected);
        }

        // 의미 있는 것들을 모아 메서드 생성
        public HitPoint recover(final int recoveryAmount) {
            final int recovered = value - recoveryAmount;
            final int corrected = recovered < MAX ? MAX : recovered;
            return new HitPoint(corrected);
        }
    }
}
