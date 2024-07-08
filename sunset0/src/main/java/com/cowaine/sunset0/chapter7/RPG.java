package com.cowaine.sunset0.chapter7;

import com.cowaine.sunset0.chapter4.use_immutability_variability.StateType;

import java.util.ArrayList;
import java.util.List;


public class RPG {

    private int totalDamage;

    //7.3 자주 볼 수 있는 중첩 구조
    public void checkAddiction() {
        List<Member> members = new ArrayList<>();
        for (Member member : members) {
            if (0 < member.hitPoint) {
                if (member.containState(StateType.poison)) {
                    member.hitPoint -= 10;
                    if (member.hitPoint <= 0) {
                        member.hitPoint = 0;
                        member.addState(StateType.dead);
                        member.removeState(StateType.poison);
                    }
                }
            }
        }
    }

    //7.5 if 조건문의 중첩을 모두 제거한 상태 (조기 continue)
    public void checkAddictionWithContinue() {
        List<Member> members = new ArrayList<>();
        for (Member member : members) {
            if(member.hitPoint == 0) continue;
            if(!member.containState(StateType.poison)) continue;
            member.hitPoint -= 10;

            if(0< member.hitPoint) continue;
            member.hitPoint = 0;
            member.addState(StateType.dead);
            member.removeState(StateType.poison);
        }
    }

    //7.6 중첩이 복잡해서 가독성이 떨어지는 로직
    public void linkedAttack() {
        List<Member> members = new ArrayList<>();
        for (Member member : members) {
            if (member.hasTeamAttackSucceeded()) {
                int damage = (int) (member.attack() * 1.1);
                if (30 <= damage) {
                    totalDamage += damage;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
    }

    //7.7 조기 브레이크로 가독성 개선하기
    public void linkedAttackWithBreak() {
        List<Member> members = new ArrayList<>();
        for (Member member : members) {
            if(!member.hasTeamAttackSucceeded()) break;
            int damage = (int) (member.attack() * 1.1);

            if(damage<30) break;
            totalDamage += damage;
        }
    }



}
