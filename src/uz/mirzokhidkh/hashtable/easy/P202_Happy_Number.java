package uz.mirzokhidkh.hashtable.easy;

import java.util.HashSet;
import java.util.Set;

public class P202_Happy_Number {

    public static void main(String[] args) {
        System.out.println(isHappy(4));
    }
    //APPROACH-1

    public static boolean isHappy(int n) {

        Set<Integer> seen = new HashSet<>();
        while (n != 1 && !seen.contains(n)) {
            seen.add(n);
//            n = getSumOfSquaresOfDigitsOf(String.valueOf(n));
            n = getSumOfSquaresOfDigitsOf(n);
        }

        return n == 1;
    }

    public static int getSumOfSquaresOfDigitsOf(int n){
        int s = 0;
        while(n>0){
            int residue = n%10;
            n /= 10;
            s += (int)Math.pow(residue,2);
        }
        return s;
    }


    //APPROACH-2
//    public static int getSumOfSquaresOfDigitsOf(String n) {
//
//        int s = 0, l = 0, r = n.length() - 1;
//
//        while (l <= r) {
//            int dl = Integer.parseInt("" + n.charAt(l));
//            int dr = Integer.parseInt("" + n.charAt(r));
//
//            s += (int) ( Math.pow(dl, 2) + Math.pow(dr, 2));
//            l++;
//            r--;
//        }
//        int a = Integer.parseInt("" + n.charAt(l-1));
//        return s - l-1==r+1? (int) Math.pow(a, 2):0;
//
//    }


}
