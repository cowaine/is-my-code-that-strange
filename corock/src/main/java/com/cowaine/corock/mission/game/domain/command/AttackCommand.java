package com.cowaine.corock.mission.game.domain.command;

import com.cowaine.corock.mission.game.domain.character.Dragon;
import com.cowaine.corock.mission.game.domain.character.GameCharacter;
import com.cowaine.corock.mission.game.domain.character.Orc;
import com.cowaine.corock.mission.game.domain.character.PlayerCharacter;
import com.cowaine.corock.mission.game.domain.character.Soldier;
import com.cowaine.corock.mission.game.domain.message.GameMessage;

import java.util.ArrayList;
import java.util.List;

/**
 * GameQuitCommand executes when characters are attack.
 */
public class AttackCommand implements Command {
    private final Sendable sendable;
    private final PlayerCharacter soldier;
    private final GameCharacter monster;

    /**
     * AttackCommand Constructor.
     *
     * @param sendable Sendable interface for message to client
     * @param soldier  Player character
     * @param monster  Non-player character
     */
    public AttackCommand(Sendable sendable, PlayerCharacter soldier, GameCharacter monster) {
        this.sendable = sendable;
        this.soldier = soldier;
        this.monster = monster;
    }

    @Override
    public CommandResult execute() {
        List<String> messages = new ArrayList<>();

        int turn = 0;
        while (isFighting(soldier, monster)) {
            Thread soldierAttack = new Thread(soldier);
            Thread monsterAttack = new Thread(monster);

            try {
                soldierAttack.start();
                Thread.sleep(500);
                monsterAttack.start();
                Thread.sleep(500);

                sendable.send(GameMessage.getTurn(++turn));
                sendable.send(GameMessage.getGameCharacterInfo(soldier));
                if (soldier.getDamage() == GameCharacter.Stats.DRAGON_BREATH.getValue()) {
                    sendable.send(GameMessage.getSpecialMoveMessage(monster));
                }
                sendable.send(GameMessage.getGameCharacterInfo(monster));
            } catch (InterruptedException ie) {
                System.err.println("InterruptedException: " + ie);
                Thread.currentThread().interrupt();
            }
        }

        GameCharacter loser = getLoser(soldier, monster);
        if (isLoserSoldierOrDragon(loser, soldier.getUserId())) {
            // If the game is over
            return new CommandResult(messages, true);
        }

        sendable.send(GameMessage.getKilledCharacter(monster));
        if (loser instanceof Orc) {
            soldier.levelUp();
            sendable.send(GameMessage.getLevelUpMessage(soldier));
            sendable.send(soldier + System.lineSeparator());
        }
        sendable.send(GameMessage.getPressEnterToContinue());

        return new CommandResult(messages, false);
    }

    private boolean isLoserSoldierOrDragon(GameCharacter loser, String userId) {
        if (loser instanceof Soldier) {
            sendable.sendToAll(GameMessage.getClientDyingMessage(userId));
            sendable.sendToAll("quit");
            return true;
        }

        if (loser instanceof Dragon) {
            sendable.sendToAll(GameMessage.getKilledDragonMessage(userId));
            sendable.sendToAll("quit");
            return true;
        }
        return false;
    }

    private GameCharacter getLoser(PlayerCharacter soldier, GameCharacter monster) {
        return soldier.getHp() == 0 ? soldier : monster;
    }

    private boolean isFighting(PlayerCharacter soldier, GameCharacter monster) {
        return soldier.getHp() > 0 && monster.getHp() > 0;
    }
}
