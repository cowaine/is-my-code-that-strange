package com.cowaine.corock.chapter09.calculator;

import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
class LocationAwareOperand {

    private static final int MAX = 9_999;
    private static final int MIN = 10;

    private final Operand operand;
    private final Position position;

    static LocationAwareOperand create(Operand operand, Position position) {
        if (exceedsMaxValue(operand, position)) {
            throw new IllegalArgumentException();
        }

        if (exceedsMinValue(operand, position)) {
            throw new IllegalArgumentException();
        }

        return new LocationAwareOperand(operand, position);
    }

    private static boolean exceedsMaxValue(Operand operand, Position position) {
        return Objects.equals(position, Position.LEFT) && MAX < operand.getValue();
    }

    private static boolean exceedsMinValue(Operand operand, Position position) {
        return Objects.equals(position, Position.RIGHT) && MIN < operand.getValue();
    }

    LocationAwareOperand multiply(LocationAwareOperand other) {
        return new LocationAwareOperand(Operand.create(operand.getValue() * other.operand.getValue()), position);
    }

    @Override
    public String toString() {
        return String.valueOf(operand.getValue());
    }

}
