package com.cowaine.firewoody237.one_to_six.good_code;

import java.util.List;

public class MagicPoint {
    private int currentAmount;
    private int originalMaxAmount;
    private List<Integer> maxIncrements;

    int current() {
        return currentAmount;
    }

    int max() {
        int amount = originalMaxAmount;
        for (int each : maxIncrements) {
            amount += each;
        }
        return amount;
    }
}
