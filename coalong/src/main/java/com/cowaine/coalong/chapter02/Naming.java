package com.cowaine.coalong.chapter02;

public class Naming {

    void calcDamage(int p1, int p2, int d1, int d2) {
        int d = 0;
        d = p1 + p2;
        d = d - ((d1 + d2) / 2);
        if (d < 0) {
            d = 0;
        }
    }
}
