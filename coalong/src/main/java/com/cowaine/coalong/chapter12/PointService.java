package com.cowaine.coalong.chapter12;

public class PointService {

    private int point;

    /**
     * 포인트를 증가(커맨드)
     */
    void gainPoint() {
        point += 10;
    }

    /**
     * 포인트를 리턴(쿼리)
     *
     * @return 포인트
     */
    int getPoint() {
        return point;
    }

}
