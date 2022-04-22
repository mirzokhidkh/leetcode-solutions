package uz.mkhasanov.backtracking.medium;

import java.util.*;

public class P78_Subsets {

    public static void main(String[] args) {
        System.out.println(subsets(new int[]{1, 2, 3}));
//        // {}
//        // {1}, {1,2}, {1,2,3}, {1,3}
//        // {2}, {2,3}
//        // {3}
//        System.out.println(subsets(new int[]{1, 2, 3, 4}));

    }


    private static final List<List<Integer>> res = new ArrayList<>();
    private static Stack<Integer> subset = new Stack<>();

    public static List<List<Integer>> subsets(int[] nums) {
        dfs(0,nums);
        return res;
    }


    private static void dfs(int i, int[] nums){

        if (i>=nums.length){
            System.out.println(subset);
            res.add(new ArrayList(subset));
            return;
        }

        subset.add(nums[i]);
        dfs(i+1,nums);

        subset.pop();
        dfs(i+1,nums);
    }

}