package com.cowaine.sunset0.mission.game.character.monster;

import com.cowaine.sunset0.mission.game.character.AttackPower;
import com.cowaine.sunset0.mission.game.character.Health;
import com.cowaine.sunset0.mission.game.character.Level;
import com.cowaine.sunset0.mission.game.character.hero.Hero;

import java.util.Random;

public class Slim implements Monster{

    private static int INITIAL_HEALTH = 30;
    private static int INITIAL_ATTACK_POWER = 4;

    private Level level;
    private Health health;
    private AttackPower attackPower;
    private Random random = new Random();

    private Slim() {
        this.level = Level.ONE;
        this.health = new Health(INITIAL_HEALTH);
        this.attackPower = new AttackPower(INITIAL_ATTACK_POWER);
    }

    public static Slim createSlim() {
        return new Slim();
    }

    @Override
    public void attack(Hero hero) {
        //0.5초 마다 상대를 1~6 사이에서 랜덤한 대미지로 공격합니다.
        int damage = random.nextInt(attackPower.get()) + 1;
        hero.takeDamage(new Health(damage));
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
