package com.cowaine.sunset0.mission.game.character.hero;

import com.cowaine.sunset0.mission.game.character.AttackPower;
import com.cowaine.sunset0.mission.game.character.Health;
import com.cowaine.sunset0.mission.game.character.Level;
import com.cowaine.sunset0.mission.game.character.monster.Monster;

import java.util.Random;

public class Hero {

    private static final int INITIAL_HEALTH = 100;
    private static final int INITIAL_ATTACK_POWER = 10;

    private String id;
    private Level level;
    private Health health;
    private AttackPower attackPower;

    private Random random = new Random();


    public Hero(String id) {
        this.id = id;
        this.level = Level.ONE;
        this.health = new Health(INITIAL_HEALTH);
        this.attackPower = new AttackPower(INITIAL_ATTACK_POWER);
    }


    public void attack(Monster monster) {
        //0.5초 마다 상대를 1~10 사이에서 랜덤한 대미지로 공격합니다.
        int damage = random.nextInt(attackPower.get()) + 1;
        monster.takeDamage(new Health(damage));
    }

    public void takeDamage(Health damage) {
        this.health = health.decline(damage);
    }


    public boolean isAlive() {
        return this.health.isLeft();
    }

}
