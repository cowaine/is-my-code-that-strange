package com.cowaine.firewoody237.fifth_week.bad_code.multiple_calculator;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;

public class MultipleApplication {

    public static void main(String[] args) {
        FirstNumber fn = new FirstNumber(10);
        SecondNumber sn = new SecondNumber(5);
        int result = MultipleCalculator.multiply(new FirstNumber(10), new SecondNumber(5));
        System.out.println("result = " + result);

        try {
            Class firstNumberClass = Class.forName("com.cowaine.firewoody237.fifth_week.bad_code.multiple_calculator.FirstNumber");
            Constructor constructor = firstNumberClass.getConstructor(Integer.class);
            FirstNumber fn2 = (FirstNumber) constructor.newInstance(30);
            result = MultipleCalculator.multiply(fn2, new SecondNumber(5));
            System.out.println("result = " + result);

            Field field = fn2.getClass().getField("value");
            field.set(fn2, 100);
            result = MultipleCalculator.multiply(fn2, new SecondNumber(5));
            System.out.println("result = " + result);

        } catch (Exception e) {
        }
    }
}
