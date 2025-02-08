package com.cowaine.coalong.chapter05;

public class Util {
    /**
     * @param regularPrice 정가
     * @return 적절한 가격이라면 true
     */
    boolean isFairPrice(int regularPrice) {
        if (regularPrice <= 0) {
            throw new IllegalArgumentException();
        }
        return true;
    }
}
