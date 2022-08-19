package uz.mirzokhidkh.hashtable.medium;

import java.util.HashSet;
import java.util.Set;

public class P36_Valid_Sudoku {

    public boolean isValidSudoku(char[][] board) {

        Set<String> seen = new HashSet<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                char digit = board[i][j];

                if (digit != '.') {
                    if (!seen.add(digit + "in row" + i) ||
                            !seen.add(digit + "in column" + j) ||
                            !seen.add(digit + "in sub-box " + i / 3 + "-" + j / 3)) {
                        return false;
                    }
                }
            }
        }


        return true;
    }



}
