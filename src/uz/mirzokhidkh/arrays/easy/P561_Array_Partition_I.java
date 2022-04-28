package uz.mirzokhidkh.arrays.easy;

import java.util.Arrays;

public class P561_Array_Partition_I {
    public int arrayPairSum(int[] nums) {
        int l = nums.length;
        Arrays.sort(nums);
        int sum = 0;
        int start = 0;
        int end = l - 2;
        while (start < end) {
            sum += nums[start] + nums[end];
            start += 2;
            end -= 2;
        }
        return (l / 2) % 2 == 0 ? sum : sum + nums[start];
    }
}
