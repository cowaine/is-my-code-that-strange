package com.cowaine.sunset0.chapter6.strategy_pattern.magic;

public interface Magic {

    String name();
    MagicPoint costMagicPoint();
    AttackPower attackPower();
    TechnicalPoint costTechnicalPoint();

    class TechnicalPoint {
        public TechnicalPoint(int value) {

        }
    }

    class AttackPower {
        public AttackPower(int value) {

        }
    }

    class MagicPoint {
        public MagicPoint(int value) {

        }
    }
}
