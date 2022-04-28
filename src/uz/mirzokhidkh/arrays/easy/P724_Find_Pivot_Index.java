package uz.mirzokhidkh.arrays.easy;

public class P724_Find_Pivot_Index {
    public static void main(String[] args) {
        int[] a = new int[]{1, 7, 3, 6, 5, 6};
        System.out.println(pivotIndex(a));
    }


    public static int pivotIndex(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int sum = 0, left = 0, right = nums.length - 1;
            while (left < i) {
                sum += nums[left++];
            }
            while (right > i) {
                sum -= nums[right--];
            }
            System.out.println(i + " = " + sum);
            if (sum == 0) return left;
        }
        return -1;
    }
}
