package uz.mirzokhidkh.recursion.easy;

import java.util.ArrayList;
import java.util.List;

public class P119_Pascal_s_Triangle_II {


    //Brute Force SOLUTION , BUT TIME LIMIT EXCEEDED
//    public List<Integer> getRow(int rowIndex) {
//
//        List<Integer> list = new ArrayList<>();
//        for (int i = 0; i <= rowIndex; i++) {
//            list.add(recur(rowIndex, i));
//        }
//
//        return list;
//    }
//
//    public Integer recur(int i, int j) {
//        if (j == 0 || i == j) return 1;
//
//        return recur(i - 1, j - 1) + recur(i - 1, j);
//    }


    //MEMOIZATION approach

    public List<Integer> getRow(int rowIndex) {
        int[][] memo = new int[rowIndex + 1][rowIndex + 1];

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i <= rowIndex; i++) {
            list.add(recur(rowIndex, i, memo));
        }

        return list;
    }

    public Integer recur(int i, int j, int[][] memo) {
        if (j == 0 || i == j) {
            memo[i][j] = 1;
            return 1;
        }

        if (memo[i][j] != 0) return memo[i][j];

        memo[i][j] = (recur(i - 1, j - 1, memo) + recur(i - 1, j, memo));

        return memo[i][j];
    }

}
