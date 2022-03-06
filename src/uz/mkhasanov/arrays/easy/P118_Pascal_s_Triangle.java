package uz.mkhasanov.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class P118_Pascal_s_Triangle {
    public static void main(String[] args) {
        System.out.println(generate(5));
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            row.add(1);
            List<Integer> prevRow;
            for (int j = 1; j < i; j++) {
                prevRow = list.get(i - 1);
                int a = prevRow.get(j) + prevRow.get(j - 1);
                row.add(a);
            }
            if (i > 0)
                row.add(1);
            list.add(row);
        }
        return list;
    }
}
