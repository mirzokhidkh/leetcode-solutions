package uz.mkhasanov;

import java.util.ArrayList;
import java.util.List;

public class Problem70 {
    public static void main(String[] args) {
        System.out.println(climbStairs(1));
        System.out.println(climbStairs(2));
        System.out.println(climbStairs(3));
//        System.out.println(climbStairs(4));
//        System.out.println(climbStairs(44));
    }

//    public static int climbStairs(int n) {
//        if (n == 0) {
//            return 1;
//        } else if (n < 0) {
//            return 0;
//        }
//        return climbStairs(n - 1) + climbStairs(n - 2);
//    }

    public static int climbStairs(int n) {
//        if (n < 2) {
//            return 1;
//        }
//        return climbStairs(n - 1) + climbStairs(n - 2);

        List<Integer> arr = new ArrayList<>();
        climbStairs(n, arr);
        return arr.get(n - 1);
    }

    public static void climbStairs(int n, List<Integer> arr) {
        if (!arr.contains(n)) {
//            return;
//        }
            if (n < 2) {
                arr.add(1);
                return;
            } else {
                arr.add(arr.get(n - 1));
            }
            climbStairs(n - 1, arr);
            climbStairs(n - 2, arr);
        }
    }

}
