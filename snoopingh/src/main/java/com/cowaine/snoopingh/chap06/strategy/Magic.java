package com.cowaine.snoopingh.chap06.strategy;

/**
 * 전략패턴 : 인터페이스를 사용해서 처리를 한꺼번에 전화하는 설계
 * 유사한 디자인 패턴으로는 "상태 패턴"이 있음 (상태에 따라서 제어 전환을 간단하게 하기 위해 사용)
 */
public interface Magic {
    String name();
    int costMagicPoint();
    int attackPower();
    int costTechnicalPoint();
}
