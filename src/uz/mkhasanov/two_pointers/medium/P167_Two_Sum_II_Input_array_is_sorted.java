package uz.mkhasanov.two_pointers.medium;

import java.util.Arrays;

public class P167_Two_Sum_II_Input_array_is_sorted {
    public static void main(String[] args) {
        int[] a = new int[]{2, 7, 11, 15};
        int[] b = new int[]{12, 13, 23, 28, 43, 44, 59, 60, 61, 68, 70, 86, 88, 92, 124, 125, 136, 168, 173, 173, 180, 199, 212, 221, 227, 230, 277, 282, 306, 314, 316, 321, 325, 328, 336, 337, 363, 365, 368, 370, 370, 371, 375, 384, 387, 394, 400, 404, 414, 422, 422, 427, 430, 435, 457, 493, 506, 527, 531, 538, 541, 546, 568, 583, 585, 587, 650, 652, 677, 691, 730, 737, 740, 751, 755, 764, 778, 783, 785, 789, 794, 803, 809, 815, 847, 858, 863, 863, 874, 887, 896, 916, 920, 926, 927, 930, 933, 957, 981, 997};
        int[] c = new int[]{-1, 0};
        System.out.println(Arrays.toString(twoSum(a, 9)));
        System.out.println(Arrays.toString(twoSum(b, 542))); //[24,32]
        System.out.println(Arrays.toString(twoSum(c, -1)));

    }

    public static int[] twoSum(int[] numbers, int target) {

        return new int[]{};
    }

}
