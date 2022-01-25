package uz.mkhasanov.arrays.easy;

import java.util.Arrays;

public class P1295_Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int[] a = new int[]{12, 345, 2, 6, 7896};
        System.out.println(findNumbers2(a));
    }


    ///APPROACH-1

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (String.valueOf(nums[i]).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    ///APPROACH-2
    public static int findNumbers2(int[] nums) {
        int count = 0;

        for (int i = 0; i < nums.length; i++) {
            int numberOfDigits = 0;
            while (nums[i] > 0) {
                nums[i] = nums[i] / 10;
                numberOfDigits++;
            }

            if (numberOfDigits % 2 ==0) {
                count++;
            }
        }

        return count;
    }

}
