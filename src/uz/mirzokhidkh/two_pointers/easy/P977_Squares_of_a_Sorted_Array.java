package uz.mirzokhidkh.two_pointers.easy;

public class P977_Squares_of_a_Sorted_Array {
    public int[] sortedSquares(int[] nums) {

        int n = nums.length;
        int[] arr = new int[n];

        int left = 0, right = n - 1, i = n - 1;

        while (left < n && right >= 0 && i >= 0) {

            if (Math.abs(nums[left]) < nums[right]) {
                arr[i] = (int) Math.pow(nums[right], 2);
                right--;
            } else {
                arr[i] = (int) Math.pow(nums[left], 2);
                left++;
            }

            i--;
        }

        return arr;
    }

}
