package com.cowaine.corock.chapter06.game;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.HashMap;
import java.util.Map;

@RequiredArgsConstructor
@Getter
public class Member {

    private final Map<MagicType, Magic> magics = new HashMap<>();

    private final int hitPoint;
    private final int maxHitPoint;
    private final int magicPoint;
    private final int technicalPoint;
    private final int level;
    private final int agility;
    private final int magicAttack;
    private final int vitality;

    public boolean canAct() {
        return false;
    }

    public void chant(Magic magic) {
        // (...)
    }

    /**
     * 마법 공격을 실행한다.
     *
     * @param magicType 마법 유형
     */
    public void magicAttack(final MagicType magicType) {
        final Magic usingMagic = magics.get(magicType);

        this.showMagicName(usingMagic);
        this.consumeMagicPoint(usingMagic);
        this.consumeTechnicalPoint(usingMagic);
        this.magicDamage(usingMagic);
    }

    // 마법 이름을 화면에 출력하기
    void showMagicName(final Magic magic) {
        final String name = magic.name();
    }

    // 매직 포인트 소비하기
    void consumeMagicPoint(Magic magic) {
        final int costMagicPoint = magic.costMagicPoint();

        // TODO: costMagicPoint 를 사용해서 마법 소비 처리
    }

    // 테크니컬 포인트 소비하기
    void consumeTechnicalPoint(Magic magic) {
        final int costTechnicalPoint = magic.costTechnicalPoint();

        // TODO: costTechnicalPoint 를 사용해서 테크니컬 포인트 소비 처리
    }

    // 대미지 계산하기
    void magicDamage(Magic magic) {
        final int attackPower = magic.attackPower();

        // TODO: attackPower 를 사용해서 대미지 계산
    }

}
