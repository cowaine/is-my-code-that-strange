package com.cowaine.fourteenth.game;

import java.util.Random;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DiceGameApplication {

    public static void main(String[] args) {
        DiceGame diceGame = new DiceGame();
        Random random = new Random();

        boolean running;
        do {
            int[][] diceGameTable = new int[DiceGame.PLAYER_COUNT][DiceGame.DICE_COUNT];
            for (int i = 0; i < diceGameTable.length; i++) {
                int sum = 0;
                for (int j = 0; j < diceGameTable[0].length - 1; j++) {
                    diceGameTable[i][j] = random.nextInt(6) + 1;
                    if (diceGame.checkDuplication(diceGameTable, i, j)) {
                        j -= 1;
                        continue;
                    }
                    sum += diceGameTable[i][j];
                }
                diceGameTable[i][DiceGame.DICE_COUNT - 1] = sum;
            }

            int winnerIndex = diceGame.indexOfWinningUser(diceGameTable);
            char winningUser = (char) (winnerIndex + 65);

            log.info("사용자 " + winningUser + "가 승리했습니다!");
            log.info("사용자 " + winningUser + "의 주사위 합은 " +
                    diceGameTable[winnerIndex][DiceGame.DICE_COUNT - 1] + " 입니다.");

            running = false;
        } while (running);
    }

}
