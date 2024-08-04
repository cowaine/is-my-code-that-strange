package com.cowaine.firewoody237.mission.dragon.domain.monster;

import com.cowaine.firewoody237.mission.dragon.domain.battle.Damage;
import com.cowaine.firewoody237.mission.dragon.domain.monster.skill.Skill;
import com.cowaine.firewoody237.mission.dragon.domain.monster.skill.SkillChanceStrategy;
import com.cowaine.firewoody237.mission.dragon.domain.monster.vo.MonsterAttackPoint;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SkillTest {

    @Test
    @DisplayName("전략에 따라 스킬 사용 여부를 반환한다.")
    void test1() {
        SkillChanceStrategy alwaysTrueSkill = new SkillChanceStrategy() {
            @Override
            public boolean canUseSkill(double chance) {
                return true;
            }
        };

        Skill skill = new Skill(1, new MonsterAttackPoint(10), alwaysTrueSkill);

        assertThat(skill.canUseSkill())
                .isTrue();
    }

    @Test
    @DisplayName("스킬에 사용하면 고정데미지를 반환한다.")
    void test2() {
        SkillChanceStrategy alwaysTrueSkill = new SkillChanceStrategy() {
            @Override
            public boolean canUseSkill(double chance) {
                return true;
            }
        };

        Skill skill = new Skill(1, new MonsterAttackPoint(10), alwaysTrueSkill);

        assertThat(skill.useSkill())
                .isEqualTo(new Damage(10));
    }
}
