package com.cowaine.corock.chapter09.calculator;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MultipleApplication {

    public static void main(String[] args) {
        Operand integer = Operand.create(5);
        log.info("result = {}", Operand.create(10).multiply(integer));
        log.info("result = {}", integer.multiply(Operand.create(30)));
        log.info("result = {}", Operand.create(100).multiply(integer));
    }

}
