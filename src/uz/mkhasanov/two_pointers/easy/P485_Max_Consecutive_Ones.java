package uz.mkhasanov.two_pointers.easy;

public class P485_Max_Consecutive_Ones {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0, k = 0, i = 0;
        while (i < nums.length) {
            if (nums[i] == 1) {
                k++;
            }
            if (nums[i] == 0) {
                k = 0;
            }
            max = Math.max(max, k);
            i++;
        }
        return max;
    }
}
