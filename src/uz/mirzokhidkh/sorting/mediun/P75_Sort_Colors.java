package uz.mirzokhidkh.sorting.mediun;

public class P75_Sort_Colors {
    public void sortColors(int[] nums) {

        int minInd;

        for (int i = 0; i < nums.length; i++) {
            minInd = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minInd]) {
                    minInd = j;
                }
            }

            swap(nums, i, minInd);

        }

    }


    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
