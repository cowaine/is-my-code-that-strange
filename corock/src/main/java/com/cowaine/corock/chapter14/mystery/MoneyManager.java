package com.cowaine.corock.chapter14.mystery;

public class MoneyManager {

    public static int calc(int v, boolean flag) {
        if (flag) {
            return (int) (v * 1.1);
        }
        return v;
    }

}
