package com.cowaine.corock.chapter09.calculator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MultipleApplication {

    public static void main(String[] args) {
        Operand five = Operand.create(5);
        LocationAwareOperand right = LocationAwareOperand.create(five, Position.RIGHT);

        Operand ten = Operand.create(10);
        log.info("result = {}", LocationAwareOperand.create(ten, Position.LEFT).multiply(right));

        Operand thirty = Operand.create(30);
        log.info("result = {}", LocationAwareOperand.create(thirty, Position.LEFT).multiply(right));

        Operand oneHundred = Operand.create(100);
        log.info("result = {}", LocationAwareOperand.create(oneHundred, Position.LEFT).multiply(right));
    }

}
