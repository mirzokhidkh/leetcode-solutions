package uz.mkhasanov.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

public class P78_Subsets {

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3}));
//        // {}
//        // {1}, {1,2}, {1,2,3}, {1,3}
//        // {2}, {2,3}
//        // {3}
        System.out.println(subsets(new int[]{1, 2, 3, 4}));

    }

    public static List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());

        List<Integer> subset = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            subset.add(nums[i]);
            list.add(subset);

            subset = new ArrayList<>();

            for (int l = i; l < nums.length; l++) {

                for (int j = l + 1; j < nums.length; j++) {
                    subset.add(nums[i]);

                    for (int k = l + 1; k < j + 1; k++) {
                        subset.add(nums[k]);
                    }
                    list.add(subset);
                    subset = new ArrayList<>();

                }


            }

        }

        return list;
    }


}