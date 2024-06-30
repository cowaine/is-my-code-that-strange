package com.cowaine.corock.chapter07.game;

import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class MemberService {

    private final List<Member> members;

    public void reduceHitPointForPoisonedMembers() {
        // FIXME: Reduce the total number of break and continue statements in this loop to use at most one.
        for (Member member : members) {
            /*
             * 살아 있지 않다면 continue 로 다음 반복으로 넘어감.
             * 조기 continue 로 변경하려면 조건을 반전해야 함.
             */
            if (member.getHitPoint() == 0) {
                continue;
            }

            if (!member.containsState(StateType.POISON)) {
                continue;
            }

            member.setHitPoint(10);

            if (0 < member.getHitPoint()) {
                continue;
            }

            member.setHitPoint(0);
            member.addState(StateType.DEAD);
            member.removeState(StateType.POISON);
        }
    }

    /**
     * 연계 공격력의 총 대미지를 계산한다.
     *
     * @implSpec
     * 연계 공격력의 총 대미지는 다음과 같이 계산한다.
     *
     * <ul>
     *     <li>첫 멤버부터 차례대로 연계 공격의 성공 여부를 평가</li>
     *     <li>연계 공격에 성공한 경우, 해당 멤버의 공격력 X 1.1 을 대미지로 추가</li>
     *     <li>연계 공격에 실패한 경우, 후속 멤버의 연계를 평가하지 않음</li>
     *     <li>한 멤버의 추가 대미지가 30 이상인 경우, 추가되는 대미지까지 총 대미지에 합산</li>
     *     <li>한 멤버의 추가 대미지가 30 미만인 경우, 연계 공격 실패로 간주하고 후속 멤버의 연계를 평가하지 않음</li>
     * </ul>
     */
    public void calculateComboAttackDamage() {
        int totalDamage = 0;

        // FIXME: Reduce the total number of break and continue statements in this loop to use at most one.
        for (Member member : members) {
            if (!member.hasTeamAttackSucceeded()) {
                break;
            }

            int damage = (int) (member.attack() * 1.1);

            if (damage < 30) {
                break;
            }

            totalDamage += damage;
        }
    }

}
