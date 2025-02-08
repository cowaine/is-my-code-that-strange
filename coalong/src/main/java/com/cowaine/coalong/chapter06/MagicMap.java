package com.cowaine.coalong.chapter06;

import java.util.HashMap;
import java.util.Map;

public class MagicMap {
    final Map<MagicType, Magic> magics = new HashMap<>();

    void inputMap(Member member) {
        final Fire fire = new Fire(member);
        final Lightning lightning = new Lightning(member);

        final HellFire hellFire = new HellFire(member);

        magics.put(MagicType.fire, fire);
        magics.put(MagicType.lighting, lightning);
        magics.put(MagicType.hellFire, hellFire);
    }

    void magicAttack(final MagicType magicType) {
        final Magic usingMagic = magics.get(magicType);

        showMagicName(usingMagic);
        consumeMagicPoint(usingMagic);
        consumeTechnicalPoint(usingMagic);
        magicDamage(usingMagic);
    }

    // 대미지 계산하기
    private void magicDamage(Magic usingMagic) {
    }

    // 테크니컬포인트 소비하기
    private void consumeTechnicalPoint(Magic usingMagic) {
    }

    // 매직포인트 소비하기
    private void consumeMagicPoint(Magic usingMagic) {
    }

    // 마법 이름을 화면에 출력하기
    private void showMagicName(Magic usingMagic) {
        final String name = usingMagic.name();
    }
}
