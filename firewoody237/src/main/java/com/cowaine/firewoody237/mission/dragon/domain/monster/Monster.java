package com.cowaine.firewoody237.mission.dragon.domain.monster;

import com.cowaine.firewoody237.mission.dragon.domain.battle.Damage;
import com.cowaine.firewoody237.mission.dragon.domain.monster.skill.ProbabilityStrategy;
import com.cowaine.firewoody237.mission.dragon.domain.monster.skill.Skill;
import com.cowaine.firewoody237.mission.dragon.domain.monster.vo.MonsterAttackPoint;
import com.cowaine.firewoody237.mission.dragon.domain.monster.vo.MonsterHealthPoint;

public class Monster {
    private final MonsterType monsterType;
    private final Health health;
    private final Attack attack;
    private final Skill skill;

    public Monster(
            MonsterType monsterType, MonsterHealthPoint maximumMonsterHealthPoint,
            MonsterAttackPoint minimumMonsterAttackPoint, MonsterAttackPoint maximumMonsterAttackPoint,
            double skillChance, MonsterAttackPoint skillDamage,
            Skill skill) {
        this.monsterType = monsterType;
        this.health = new Health(maximumMonsterHealthPoint, maximumMonsterHealthPoint);
        this.attack = new Attack(minimumMonsterAttackPoint, maximumMonsterAttackPoint);
        this.skill = new Skill(skillChance, skillDamage, new ProbabilityStrategy());
    }

    public Damage attack() {
        return attack.attack();
    }

    public MonsterHealthPoint getDamage(Damage damage) {
        return health.getDamage(damage);
    }

    public MonsterHealthPoint getRemainHealthPoint() {
        return health.getRemainHealthPoint();
    }
}
