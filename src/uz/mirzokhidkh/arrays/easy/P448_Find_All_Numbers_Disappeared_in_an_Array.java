package uz.mirzokhidkh.arrays.easy;

import java.util.ArrayList;
import java.util.List;

public class P448_Find_All_Numbers_Disappeared_in_an_Array {
    public List<Integer> findDisappearedNumbers(int[] nums) {

        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int ind = Math.abs(nums[i]);
            if (nums[ind - 1] > 0) {
                nums[ind - 1] *= -1;
            }

        }

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            if (nums[i] > 0) {
                res.add(i + 1);
            }
        }

        return res;
    }
}



