package uz.mkhasanov.arrays.medium;

import java.io.IOException;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;

public class P209_Minimum_Size_Subarray_Sum {

    public int minSubArrayLen(int target, int[] nums) {
        int min = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length / 2; i++) {
            int lSum = 0;
            int rSum = 0;
            int len = nums.length - 1 - i;
            for (int l = i; l <= len; l++) {
                lSum += nums[l];
                if (lSum >= target) {
                    min = Math.min(l - i + 1, min);
                }

                int r = nums.length - 1 - l;
                rSum += nums[r];
                if (rSum >= target) {
                    min = Math.min(len - r + 1, min);
                }
            }

        }
        return min != Integer.MAX_VALUE ? min : 0;
    }
}


