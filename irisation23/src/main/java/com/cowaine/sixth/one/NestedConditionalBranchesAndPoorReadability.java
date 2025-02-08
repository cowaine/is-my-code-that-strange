package com.cowaine.sixth.one;

import com.cowaine.sixth.domain.Game;
import com.cowaine.sixth.domain.Magic;
import com.cowaine.sixth.domain.Member;

import java.util.HashMap;
import java.util.Map;

public class NestedConditionalBranchesAndPoorReadability {

    public static void main(String[] args) {

        // 6.1.1 if 조건문을 중첩해서 구현한 예
        Game game = new Game(new HashMap<>(), new HashMap<>());
        game.start();

        Map<Integer, Member> members = game.getMembers();
        Map<Integer, Magic> magics = game.getMagics();
        Member member = members.get(1);
        Magic magic = magics.get(1);
        Result result = new Result(member, magic);

        // 살아 있는가

        if (0 < result.member().getHp()) {
            // 움직일 수 있는가?
            if (result.member().canAct()) {
                // 매직포인트가 남아 있는가?
                if (result.magic().getMp() <= result.member().getMp()) {
                    Member consumedMagicPointMember = result.member().consumeMagicPoint(result.magic().getMp());
                    consumedMagicPointMember.inchant(result.magic());
                }
            }
        }
    }

    private record Result(Member member, Magic magic) {
    }
}
