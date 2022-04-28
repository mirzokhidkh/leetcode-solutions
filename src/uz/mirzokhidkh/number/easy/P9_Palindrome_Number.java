package uz.mirzokhidkh.number.easy;

public class P9_Palindrome_Number {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
        System.out.println(isPalindrome(-121));
        System.out.println(isPalindrome(200));
    }


    //1-APPROACH
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int y = x;
        int res = 0;
        while (x != 0) {
            int c = x % 10;
            x /= 10;
            res = 10 * res + c;
        }

        return res == y;
    }

}
