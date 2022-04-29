package uz.mirzokhidkh.arrays.easy;

public class P26_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 0;
        int i = 0;
        while (i < n) {
            if (nums[k] != nums[i]) {
                nums[++k] = nums[i];
            }
            i++;
        }
        if (k < n - 1) {
            nums[++k] = nums[i - 1];
            return k;
        }

        return k + 1;
    }
}
