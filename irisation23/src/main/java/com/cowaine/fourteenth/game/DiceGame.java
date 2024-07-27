package com.cowaine.fourteenth.game;

public class DiceGame {

    public static final int PLAYER_COUNT = 2;
    public static final int DICE_COUNT = 2;

    public boolean checkDuplication(int[][] diceGameTable, int i, int j) {
        for (int k = 0; k < j; k++) {
            if (diceGameTable[i][j] == diceGameTable[i][k]) {
                diceGameTable[i][j] = 0;
                return true;
            }
        }
        return false;
    }

    public int indexOfWinningUser(int[][] diceGameTable) {
        int maxNumber = 0, i = 0, winnerIndex = 0;
        for (int[] user : diceGameTable) {
            if (maxNumber < user[user.length - 1]) {
                maxNumber = user[user.length - 1];
                winnerIndex = i;
            }
            i += 1;
        }
        return winnerIndex;
    }

}
