package com.cowaine.firewoody237.mission.dragon.domain.monster.skill;

import java.util.Random;

public class ProbabilityStrategy implements SkillChanceStrategy {

    @Override
    public boolean canUseSkill(double change) {
        Random random = new Random();
        return random.nextDouble() < change;
    }
}
