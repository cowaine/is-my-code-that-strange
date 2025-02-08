package com.cowaine.firewoody237.mission.dragon.domain.monster.skill;

import com.cowaine.firewoody237.mission.dragon.domain.battle.Damage;
import com.cowaine.firewoody237.mission.dragon.domain.monster.vo.MonsterAttackPoint;

public class Skill {
    private final double change;
    private final MonsterAttackPoint damage;
    private final SkillChanceStrategy skillChanceStrategy;

    public Skill(double change, MonsterAttackPoint damage, SkillChanceStrategy skillChanceStrategy) {
        this.change = change;
        this.damage = damage;
        this.skillChanceStrategy = skillChanceStrategy;
    }

    public boolean canUseSkill() {
        return skillChanceStrategy.canUseSkill(change);
    }

    public Damage useSkill() {
        return new Damage(damage);
    }
}
