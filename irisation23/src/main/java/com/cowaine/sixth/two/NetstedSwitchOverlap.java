package com.cowaine.sixth.two;

import com.cowaine.sixth.domain.Game;
import com.cowaine.sixth.domain.magic.Magic;
import com.cowaine.sixth.domain.MagicType;
import com.cowaine.sixth.domain.Member;
import com.cowaine.sixth.domain.magic.Fire;
import com.cowaine.sixth.domain.magic.Lightning;

import java.util.HashMap;
import java.util.Map;

public class NetstedSwitchOverlap {

    public static void main(String[] args) {

        Game game = new Game(new HashMap<>(), new HashMap<>());
        game.start();

        final Map<MagicType, Magic> magics = new HashMap<>();
        final Map<Integer, Member> members = game.getMembers();

        final Fire fire = new Fire(members.get(1));
        final Lightning lightning = new Lightning(members.get(1));

        magics.put(MagicType.FIRE, fire);
        magics.put(MagicType.LIGHTING, lightning);
    }
}
