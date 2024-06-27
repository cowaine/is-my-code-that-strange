package com.cowaine.corock.chapter06.game;

/**
 * 마법 인터페이스다.
 */
public interface Magic {

    /**
     * 마법 이름을 반환한다.
     *
     * @return 마법 이름
     */
    String name();

    /**
     * 매직 포인트 소비량을 반환한다.
     *
     * @return 매직 포인트 소비량
     */
    int costMagicPoint();

    /**
     * 공격력을 반환한다.
     *
     * @return 공격력
     */
    int attackPower();

    /**
     * 테크니컬 포인트 소비량을 반환한다.
     *
     * @return 테크니컬 포인트 소비량
     */
    int costTechnicalPoint();

}
