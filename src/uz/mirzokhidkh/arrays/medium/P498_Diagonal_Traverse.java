package uz.mirzokhidkh.arrays.medium;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P498_Diagonal_Traverse {

    public static void main(String[] args) throws ParseException, IOException {
        System.out.println(Arrays.toString(findDiagonalOrder(
                new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}})));//1,2,4,7,5,3,6,8,9
    }


    public static int[] findDiagonalOrder(int[][] mat) {
        int N = mat.length;
        int M = mat[0].length;
        int[] result = new int[N * M];
        int k = 0;
        List<Integer> helper = new ArrayList<Integer>();

        for (int d = 0; d < N + M - 1; d++) {
            helper.clear();

            int r = d < M ? 0 : d - M + 1;
            int c = d < M ? d : M - 1;

            while (r < N && c > -1) {
                helper.add(mat[r++][c--]);
            }

            if (d % 2 == 0)
                Collections.reverse(helper);

            for (int i = 0; i < helper.size(); i++)
                result[k++] = helper.get(i);

        }
        return result;
    }


}
