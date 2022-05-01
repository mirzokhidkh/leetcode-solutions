package uz.mirzokhidkh.two_pointers.easy;

public class P26_Remove_Duplicates_from_Sorted_Array {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 1;
        for(int i=1; i<n; i++) {
            if (nums[k-1] != nums[i]) {
                nums[k++] = nums[i];
            }
        }
        return k;
    }
}
