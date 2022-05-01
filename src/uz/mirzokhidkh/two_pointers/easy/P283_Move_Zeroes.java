package uz.mirzokhidkh.two_pointers.easy;

public class P283_Move_Zeroes {
    public void moveZeroes(int[] nums) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != 0) {
                nums[k] = nums[i];
                if (k++ != i)
                    nums[i] = 0;
            }

        }

    }
}
