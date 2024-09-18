package com.cowaine.sunset0.mission.game.character.monster;

import com.cowaine.sunset0.mission.game.character.AttackPower;
import com.cowaine.sunset0.mission.game.character.Health;
import com.cowaine.sunset0.mission.game.character.Level;
import com.cowaine.sunset0.mission.game.character.hero.Hero;

import java.security.SecureRandom;
import java.util.Random;

public class Dragon implements Monster {

    private static int INITIAL_HEALTH = 100;
    private static int INITIAL_ATTACK_POWER = 10;
    private static int BREATH_DAMAGE = 15;
    private static int BREATH_POSSIBLE_PERCENT = 10;

    private Level level;
    private Health health;
    private AttackPower attackPower;
    private Random random = new SecureRandom();

    private Dragon() {
        this.level = Level.THREE;
        this.health = new Health(INITIAL_HEALTH);
        this.attackPower = new AttackPower(INITIAL_ATTACK_POWER);
    }

    public static Dragon createDragon() {
        return new Dragon();
    }

    @Override
    public void attack(Hero hero) {
        //0.5초 마다 상대를 1~10 사이에서 랜덤한 대미지로 공격합니다.
        int damage = random.nextInt(attackPower.get()) + 1;
        hero.takeDamage(new Health(damage));

        if (isBreathCase()) {
            hero.takeDamage(new Health(BREATH_DAMAGE));
        }
    }

    /**
     * 0~9 사이의 랜덤 숫자값이 0에 해당하면 10% 확률에 속한다고 간주합니다.
     * @return 10%의 확률에 속하는지에 관한 여부
     */
    private boolean isBreathCase() {
        return random.nextInt(100) < BREATH_POSSIBLE_PERCENT;
    }

    @Override
    public void takeDamage(Health damage) {
        this.health = health.decline(damage);
    }

    @Override
    public boolean isAlive() {
        return !this.health.isLeft();
    }
}
