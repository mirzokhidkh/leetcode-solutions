package uz.mkhasanov;

import java.text.ParseException;

public class P2111_Minimum_Operations_to_Make_the_Array_K_Increasing {

    public static void main(String[] args) throws ParseException {
        System.out.println(kIncreasing(new int[]{5, 4, 3, 2, 1}, 1)); // 4
        System.out.println(kIncreasing(new int[]{4, 1, 5, 2, 6, 2}, 2)); // 0
        System.out.println(kIncreasing(new int[]{4, 1, 5, 2, 6, 2}, 3)); // 2
        System.out.println(kIncreasing(new int[]{12, 6, 12, 6, 14, 2, 13, 17, 3, 8, 11, 7, 4, 11, 18, 8, 8, 3}, 1)); // 12
    }


    public static int kIncreasing(int[] arr, int k) {
        int count = 0;
        for (int i = 0; i < arr.length - k; i++) {
//            System.out.println(i);
//            && (i >= k && i < arr.length - 1)
            if (arr[i] > arr[i + k]   ) {
                count++;
            }
        }

        return count;
    }


}
