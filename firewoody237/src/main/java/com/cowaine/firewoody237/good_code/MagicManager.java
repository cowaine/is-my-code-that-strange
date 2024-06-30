package com.cowaine.firewoody237.good_code;

import com.cowaine.firewoody237.bad_code.MagicType;

import java.util.HashMap;
import java.util.Map;

public class MagicManager {
    // 전략 패턴 -> 인터페이스를 사용해서 처리를 한꺼번에 전환하는 설계
    // 메서드를 구현하지 않으면 컴파일 오류가 발생하기 때문에 장점이 존재
    final Map<MagicType, Magic> magics = new HashMap<>();

    public void magicAttack(final MagicType magicType) {

        final Magic usingMagic = magics.get(magicType);

        showMagicName(usingMagic);
        consumeMagicPoint(usingMagic);
    }

    private void showMagicName(final Magic magic) {
        final String name = magic.name();
    }

    void consumeMagicPoint(final Magic magic) {
        final int costMagicPoint = magic.costTechnicalPoint();
    }
}
