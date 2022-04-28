package uz.mirzokhidkh.arrays.easy;

import java.util.Arrays;

public class P2022_Convert_1D_Array_Into_2D_Array {
    public static void main(String[] args) {

        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2, 3, 4}, 2, 2)));
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2, 3}, 1, 3)));
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{1, 2}, 1, 1)));
        System.out.println(Arrays.deepToString(construct2DArray(new int[]{4,5,1}, 3, 1)));

    }

    public static int[][] construct2DArray(int[] original, int m, int n) {
        if (original.length != (m * n)) {
            return new int[][]{};
        }

        int[][] arr = new int[m][n];

        int k = 0;

        for (int i = 0; i < m; i++) {
            int j;
            for (j = 0; j < n; j++) {
                arr[i][j] = original[j + k];
            }
            k += j;
        }

        return arr;
    }

}
