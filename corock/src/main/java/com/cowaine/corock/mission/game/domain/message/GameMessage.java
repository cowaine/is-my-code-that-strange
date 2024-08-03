package com.cowaine.corock.mission.game.domain.message;

import com.cowaine.corock.mission.game.domain.character.GameCharacter;
import com.cowaine.corock.mission.game.domain.character.PlayerCharacter;

/**
 * The GameMessage class contains messages to pass to the game client.
 */
public class GameMessage {
    private GameMessage() {
    }

    /**
     * Returns ASCII art dragon.
     *
     * @return A string for ASCII art dragon
     */
    public static String getAsciiArtDragon() {
        return "                 ___====-_  _-====___" + System.lineSeparator()
            + "           _--^^^#####//      \\\\#####^^^--_" + System.lineSeparator()
            + "        _-^##########// (    ) \\\\##########^-_" + System.lineSeparator()
            + "       -############//  |\\^^/|  \\\\############-" + System.lineSeparator()
            + "     _/############//   (@::@)   \\\\############\\_" + System.lineSeparator()
            + "    /#############((     \\\\//     ))#############\\" + System.lineSeparator()
            + "   -###############\\\\    (oo)    //###############-" + System.lineSeparator()
            + "  -#################\\\\  / VV \\  //#################-" + System.lineSeparator()
            + " -###################\\\\/      \\//###################-"
            + System.lineSeparator()
            + "_#/|##########/\\######(   /\\   )######/\\##########|\\#_"
            + System.lineSeparator()
            + "|/ |#/\\#/\\#/\\/  \\#/\\##\\  |  |  /##/\\#/  \\/\\#/\\#/\\#| \\|"
            + System.lineSeparator()
            + "`  |/  V  V  `   V  \\#\\| |  | |/#/  V   '  V  V  \\|  '"
            + System.lineSeparator()
            + "   `   `  `      `   / | |  | | \\   '      '  '   '" + System.lineSeparator()
            + "                    (  | |  | |  )" + System.lineSeparator()
            + "                   __\\ | |  | | /__" + System.lineSeparator()
            + "                  (vvv(VVV)(VVV)vvv)" + System.lineSeparator()
            + System.lineSeparator();
    }

    public static String getServerThreadInfo(String currentTime) {
        return "[" + currentTime + "] [Server thread/INFO]: ";
    }

    public static String getPressEnterToContinue() {
        return "=== 계속하려면 엔터를 입력해 주세요. ===" + System.lineSeparator();
    }

    /**
     * Returns a string for start messages in the game.
     *
     * @param soldier Player character(PC)
     * @return A string for start messages in the game
     */
    public static String getGameStartMessage(PlayerCharacter soldier) {
        return "용사 " + soldier.getUserId() + " 님 던전에 있는 드래곤을 물리쳐주세요!"
            + System.lineSeparator()
            + "1. 던전으로 들어간다." + System.lineSeparator()
            + "2. 도망간다. (게임 종료)" + System.lineSeparator() + ">>> ";
    }

    public static String getQuitTheGameMessage() {
        return "게임을 종료합니다." + System.lineSeparator();
    }

    public static String getTurn(int turn) {
        return "============= " + turn + "턴 =============" + System.lineSeparator();
    }

    /**
     * Returns the information for the game character.
     *
     * @param character Player Character or Non-Player Character
     * @return A string the information for the game character
     */
    public static String getGameCharacterInfo(GameCharacter character) {
        return character.getName() + "이(가) " + character.getDamage() + " 만큼 피해를 입었다!"
            + System.lineSeparator()
            + character.getName() + "의 남은 체력: " + character.getHp() + System.lineSeparator();
    }

    public static String getClientDyingMessage(String userId) {
        return "[외침] " + userId + " 는 죽었습니다. 게임이 종료됩니다." + System.lineSeparator();
    }

    public static String getKilledCharacter(GameCharacter character) {
        return "==============================" + System.lineSeparator()
            + character.getName() + "을 물리쳤습니다." + System.lineSeparator();
    }

    public static String getLevelUpMessage(GameCharacter character) {
        return "레벨 " + character.getLevel() + " 로 상승했습니다! 모든 속성이 회복되었습니다." + System.lineSeparator();
    }

    /**
     * Returns when the dragon attacks.
     *
     * @param character Boss (the dragon in this game)
     * @return A string dragon breath messages
     */
    public static String getSpecialMoveMessage(GameCharacter character) {
        return "**** " + character.getName() + "이 미처 날뛰고 있습니다! ****" + System.lineSeparator()
            + "* 드래곤 브레스로 15의 데미지를 가했다. *" + System.lineSeparator()
            + "***********************************" + System.lineSeparator();
    }

    public static String getKilledDragonMessage(String userId) {
        return "[외침] 용사 " + userId + "가 드래곤을 물리쳤습니다!" + System.lineSeparator();
    }
}
