package com.cowaine.corock.chapter05.util;

@Deprecated(forRemoval = true)
public class Utils {

    /**
     * 적절한 가격인지 확인한다.
     *
     * @param regularPrice 정가
     * @return 적절한 가격이라면 true
     */
    @Deprecated(forRemoval = true)
    boolean isFairPrice(int regularPrice) {
        if (regularPrice < 0) {
            throw new IllegalArgumentException();
        }

        return true;
    }

}
