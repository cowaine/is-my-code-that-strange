package com.cowaine.corock.chapter09.calculator;

import lombok.RequiredArgsConstructor;

import java.util.Objects;

@RequiredArgsConstructor
class LocationAwareOperand {

    private static final int LEFT_POSITION_MAX_VALUE = 9_999;
    private static final int RIGHT_POSITION_MIN_VALUE = 10;

    private final Operand operand;
    private final Position position;

    static LocationAwareOperand create(Operand operand, Position position) {
        if (exceedsMaxValue(operand, position)) {
            throw new IllegalArgumentException("왼쪽 위치의 피연산자 값이 최대 허용 값(9999)을 초과했습니다: " + operand.getValue());
        }

        if (exceedsMinValue(operand, position)) {
            throw new IllegalArgumentException("오른쪽 위치의 피연산자 값이 최소 허용 값(10)보다 큽니다: " + operand.getValue());
        }

        return new LocationAwareOperand(operand, position);
    }

    private static boolean exceedsMaxValue(Operand operand, Position position) {
        return Objects.equals(position, Position.LEFT) && LEFT_POSITION_MAX_VALUE < operand.getValue();
    }

    private static boolean exceedsMinValue(Operand operand, Position position) {
        return Objects.equals(position, Position.RIGHT) && RIGHT_POSITION_MIN_VALUE < operand.getValue();
    }

    Operand multiply(LocationAwareOperand other) {
        return Operand.create(operand.getValue() * other.operand.getValue());
    }

    @Override
    public String toString() {
        return String.valueOf(operand.getValue());
    }

}
