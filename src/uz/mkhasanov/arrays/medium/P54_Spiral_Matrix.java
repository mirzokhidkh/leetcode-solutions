package uz.mkhasanov.arrays.medium;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class P54_Spiral_Matrix {

    public static void main(String[] args) throws ParseException, IOException {
        System.out.println(spiralOrder(
                new int[][]{{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}));
        //[1,2,3,6,9,8,7,4,5]

    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int M = matrix.length;
        int N = matrix[0].length;
        int k = 0;
        List<Integer> result = new ArrayList<Integer>();

        int r = 0, head = r, tail = r + 1;



        return result;
    }
}


