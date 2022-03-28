package uz.mkhasanov.backtracking.medium;

import java.util.ArrayList;
import java.util.List;

public class P78_Subsets {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> list = new ArrayList<>();
        list.add(new ArrayList<>());

        List<Integer> subset = new ArrayList<>();

        int i = 0;
        while(i < nums.length){
            // subset.add(nums[i]);

            int k = 0;

            while(k < nums.length){
                subset = new ArrayList<>();
                int j = i;
                int l = j + k + 1;

                while(j < l && j < nums.length){
                    subset.add(nums[j]);
                    j++;
                }
                k++;
                list.add(subset);
            }

            i++;

        }

        return list;
    }

    

}