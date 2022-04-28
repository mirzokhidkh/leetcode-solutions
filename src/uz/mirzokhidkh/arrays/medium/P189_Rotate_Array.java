package uz.mirzokhidkh.arrays.medium;

public class P189_Rotate_Array {

    public void rotate(int[] nums, int k) {
        int n = nums.length;
        int[] arr = new int[n];

        while (k > n) {
            k -= n;
        }

        System.arraycopy(nums, n - k, arr, 0, k);
        System.arraycopy(nums, 0, arr, k, n - k);
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }

}


