package com.cowaine.nineth.three;

public class 매직_넘버 {
    public static void main(String[] args) {

    }

    class ReadingPoint {
        private static final int MIN = 0;
        private static final int TRIAL_READING_POINT = 60;

        final int value;

        public ReadingPoint(final int value) {
            if (value < MIN) {
                throw new IllegalArgumentException();
            }

            this.value = value;
        }

        boolean canTryRead() {
            return TRIAL_READING_POINT <= value;
        }

        ReadingPoint consumeTrial() {
            return new ReadingPoint(value - TRIAL_READING_POINT);
        }

        ReadingPoint add(final ReadingPoint point) {
            return new ReadingPoint(value + point.value);
        }
    }
}
