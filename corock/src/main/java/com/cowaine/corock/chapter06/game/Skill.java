package com.cowaine.corock.chapter06.game;

import lombok.RequiredArgsConstructor;

import java.util.Map;

@RequiredArgsConstructor
public class Skill {

    private final Map<DamageType, Damage> damages;

    public void applyDamage(final DamageType damageType, final int damageAmount) {
        final Damage damage = damages.get(damageType);
        damage.execute(damageAmount);
    }

}
