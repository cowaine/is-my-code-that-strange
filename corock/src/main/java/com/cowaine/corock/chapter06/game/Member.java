package com.cowaine.corock.chapter06.game;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
@Getter
public class Member {

    private final int hitPoint;
    private final int maxHitPoint;
    private final int magicPoint;
    private final int technicalPoint;
    private final int level;
    private final int agility;
    private final int magicAttack;
    private final int vitality;
    private final Map<MagicType, Magic> magics;

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
    public MagicAttackResponse magicAttack(final MagicType magicType) {
        final Magic usingMagic = magics.get(magicType);

        String magicName = this.showMagicName(usingMagic);
        int consumeMagicPoint = this.consumeMagicPoint(usingMagic);
        int consumeTechnicalPoint = this.consumeTechnicalPoint(usingMagic);
        int magicDamage = this.magicDamage(usingMagic);

        return new MagicAttackResponse(magicName, consumeMagicPoint, consumeTechnicalPoint, magicDamage);
    }

    /**
     * 마법 이름을 화면에 출력한다.
     *
     * @param magic 마법
     * @return 마법 이름
     */
    private String showMagicName(final Magic magic) {
        return magic.name();
    }

    /**
     * 매직 포인트를 소비한다.
     *
     * @param magic 마법
     * @return 소비한 매직 포인트
     */
    int consumeMagicPoint(Magic magic) {
        return magic.costMagicPoint();
    }

    /**
     * 테크니컬 포인트를 소비한다.
     *
     * @param magic 마법
     * @return 소비한 테크니컬 포인트
     */
    private int consumeTechnicalPoint(Magic magic) {
        return magic.costTechnicalPoint();
    }

    /**
     * 대미지를 계산한다.
     *
     * @param magic 마법
     * @return 계산된 대미지
     */
    private int magicDamage(Magic magic) {
        return magic.attackPower();
    }

}
