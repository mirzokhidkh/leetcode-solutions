package uz.mirzokhidkh.sorting.easy;

public class P414_Third_Maximum_Number {
    public int thirdMax(int[] nums) {

        bubbleSort(nums);

        int k = 1;

        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] != nums[i + 1]) {
                ++k;
            }

            if (k == 3) {
                return nums[i];
            }
        }

        return nums[nums.length - 1];

    }


    public void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - i - 1; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }
    }


}
