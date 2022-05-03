package uz.mirzokhidkh.arrays.easy;

public class P1295_Find_Numbers_with_Even_Number_of_Digits {
    public static void main(String[] args) {
        int[] a = new int[]{12, 345, 2, 6, 7896};
        System.out.println(findNumbers1(a));
    }


    /**
     * APPROACH-1
     **/

    public static int findNumbers1(int[] nums) {
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (String.valueOf(nums[i]).length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }


    /**
     * APPROACH-2
     **/
    public int findNumbers2(int[] nums) {
        int k = 0;
        for (int num : nums) {
            if (isEvenNumberOfDigits(num)) {
                k++;
            }
        }
        return k;
    }

    public boolean isEvenNumberOfDigits(int num) {
        int k = 0;
        while (num != 0) {
            num /= 10;
            k++;
        }
        return k % 2 == 0;
    }

}
