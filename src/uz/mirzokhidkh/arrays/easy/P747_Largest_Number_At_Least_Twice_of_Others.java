package uz.mirzokhidkh.arrays.easy;

public class P747_Largest_Number_At_Least_Twice_of_Others {
    public static void main(String[] args) {
        int[] a = new int[]{3, 6, 1, 0};
        System.out.println(dominantIndex(a));

    }

    public static int dominantIndex(int[] nums) {
        int max = nums[0];
        int ind = 0;
        for (int i = 1; i < nums.length; i++) {
            if (max < nums[i]) {
                max = nums[i];
                ind = i;
            }
        }

        for (int i = 0; i < nums.length; i++) {
            if (nums[i]!=0)
            if (max / nums[i] < 2 && ind != i)
                return -1;
        }
        return ind;
    }


}
