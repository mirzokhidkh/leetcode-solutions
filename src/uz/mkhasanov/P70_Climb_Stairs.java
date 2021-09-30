package uz.mkhasanov;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class P70_Climb_Stairs {
    public static void main(String[] args) {
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
        System.out.println(climbStairs(4));
//        System.out.println(climbStairs(44));
    }

    public static int climbStairs(int n) {
        int[] arr = new int[]{1, 2}; //array that saves distinct ways numbers to climb to the top for each step by ascending order
        if (n - 1 < 2) {
            return arr[n - 1];
        } else if (n > arr.length) {
            arr = Arrays.copyOf(arr, n);
        }
        climbStairs(2, arr);
        return arr[n-1];
    }

    public static void climbStairs(int pos, int[] arr) {
        if (pos + 1 > arr.length)
            return;
        arr[pos] = arr[pos - 1] + arr[pos - 2];
        climbStairs(pos + 1, arr);
    }

}
