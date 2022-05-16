package uz.mirzokhidkh.two_pointers.easy;

public class P905_Sort_Array_By_Parity {

    public int[] sortArrayByParity(int[] nums) {

        int k = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0) {
                int temp = nums[k];
                nums[k] = nums[i];
                nums[i] = temp;
                k++;
            }

        }

        return nums;

    }


}
