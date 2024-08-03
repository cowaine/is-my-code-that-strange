package com.cowaine.corock.mission.game.domain.command;

import com.cowaine.corock.mission.game.domain.character.Dragon;
import com.cowaine.corock.mission.game.domain.character.GameCharacter;
import com.cowaine.corock.mission.game.domain.character.Orc;
import com.cowaine.corock.mission.game.domain.character.PlayerCharacter;
import com.cowaine.corock.mission.game.domain.character.Slime;
import com.cowaine.corock.mission.game.domain.character.Soldier;
import com.cowaine.corock.mission.game.domain.character.Stage;

import static com.cowaine.corock.mission.game.domain.character.GameCharacter.Stats.DRAGON_HP;
import static com.cowaine.corock.mission.game.domain.character.GameCharacter.Stats.DRAGON_LEVEL;
import static com.cowaine.corock.mission.game.domain.character.GameCharacter.Stats.DRAGON_POWER;
import static com.cowaine.corock.mission.game.domain.character.GameCharacter.Stats.ORC_HP;
import static com.cowaine.corock.mission.game.domain.character.GameCharacter.Stats.ORC_LEVEL;
import static com.cowaine.corock.mission.game.domain.character.GameCharacter.Stats.ORC_POWER;
import static com.cowaine.corock.mission.game.domain.character.GameCharacter.Stats.SLIME_HP;
import static com.cowaine.corock.mission.game.domain.character.GameCharacter.Stats.SLIME_LEVEL;
import static com.cowaine.corock.mission.game.domain.character.GameCharacter.Stats.SLIME_POWER;
import static com.cowaine.corock.mission.game.domain.character.GameCharacter.Stats.SOLDIER_INIT_HP;
import static com.cowaine.corock.mission.game.domain.character.GameCharacter.Stats.SOLDIER_INIT_LEVEL;
import static com.cowaine.corock.mission.game.domain.character.GameCharacter.Stats.SOLDIER_INIT_POWER;
import static com.cowaine.corock.mission.game.domain.character.Stage.prepareStage;
import static com.cowaine.corock.mission.game.domain.command.CommandResolver.Mode.ATTACK;
import static com.cowaine.corock.mission.game.domain.command.CommandResolver.Mode.ENTER_DUNGEON;
import static com.cowaine.corock.mission.game.domain.command.CommandResolver.Mode.PRESS_ENTER;
import static com.cowaine.corock.mission.game.domain.command.CommandResolver.Mode.QUIT;

/**
 * CommandResolver passes a concrete command by the user's requests.
 */
public class CommandResolver {
    private final PlayerCharacter soldier;
    private GameCharacter monster;
    private boolean isEnterTheGame;

    /**
     * A constructor CommandResolver.
     *
     * @param userId The identification for the user
     */
    public CommandResolver(String userId) {
        this.soldier = new Soldier(userId, SOLDIER_INIT_LEVEL.getValue(),
            SOLDIER_INIT_HP.getValue(), SOLDIER_INIT_POWER.getValue(), "용사");
        this.monster = null;
        this.isEnterTheGame = false;
    }

    public void setEnterTheGame(boolean enterTheGame) {
        isEnterTheGame = enterTheGame;
    }

    /**
     * The resolve methods creates concrete command object by using command pattern.
     *
     * @param request  the request for the client
     * @param sendable Sendable interface for message to client
     * @return Concrete command
     * @throws InterruptedException Invalid command
     */
    public Command resolve(String request, Sendable sendable) throws InterruptedException {
        if (request.equals(QUIT.getValue())) {
            return new GameQuitCommand();
        }

        if (!(this.isEnterTheGame)) {
            if (request.equals(PRESS_ENTER.getValue())) {
                // 게임을 시작할 때는 Soldier 의 userId 가 필요
                return new GameStartCommand(soldier);
            }

            if (request.equals(ENTER_DUNGEON.getValue())) {
                monster = new Slime(SLIME_LEVEL.getValue(), SLIME_HP.getValue(),
                    SLIME_POWER.getValue(), "슬라임");
                Stage stage = prepareStage(monster);
                soldier.setStage(stage);
                this.setEnemy(soldier, monster);
                this.setEnterTheGame(true);

                return new CreateStageCommand(stage);
            }
        }

        if (request.equals(ATTACK.getValue())) {
            return new AttackCommand(sendable, soldier, monster);
        }

        if (request.equals(PRESS_ENTER.getValue())) {
            Stage completedStage = soldier.getStage();
            if (completedStage.getMonster() instanceof Slime) {
                monster = new Orc(ORC_LEVEL.getValue(), ORC_HP.getValue(), ORC_POWER.getValue(),
                    "오크");
            }

            if (completedStage.getMonster() instanceof Orc) {
                monster = new Dragon(DRAGON_LEVEL.getValue(), DRAGON_HP.getValue(),
                    DRAGON_POWER.getValue(), "드래곤");
            }

            Stage stage = prepareStage(monster);
            soldier.setStage(stage);
            this.setEnemy(soldier, monster);

            return new CreateStageCommand(stage);
        }

        return null;
    }

    private void setEnemy(PlayerCharacter soldier, GameCharacter monster) {
        soldier.setEnemy(monster);
        monster.setEnemy(soldier);
    }

    /**
     * A Displayable is the interface that represents value of each mode.
     */
    public interface Displayable {
        String getValue();
    }

    /**
     * The mode that displays configurations for the game.
     */
    public enum Mode implements Displayable {
        PRESS_ENTER(""), ENTER_DUNGEON("1"), ATTACK("1"), QUIT("2");

        private final String value;

        Mode(String value) {
            this.value = value;
        }

        @Override
        public String getValue() {
            return value;
        }
    }
}
