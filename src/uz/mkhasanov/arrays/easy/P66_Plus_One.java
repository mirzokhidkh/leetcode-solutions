package uz.mkhasanov.arrays.easy;

import java.util.Arrays;

public class P66_Plus_One {
    public static void main(String[] args) {
        int[] a = new int[]{9};
        int[] b = new int[]{1, 2};
        int[] c = new int[]{2, 9};
        int[] d = new int[]{9, 9, 9};
        System.out.println(Arrays.toString(plusOne(a)));
        System.out.println(Arrays.toString(plusOne(b)));
        System.out.println(Arrays.toString(plusOne(c)));
        System.out.println(Arrays.toString(plusOne(d)));

    }


    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newArr = new int[digits.length + 1];
        newArr[0] = 1;
        return newArr;
    }
}
