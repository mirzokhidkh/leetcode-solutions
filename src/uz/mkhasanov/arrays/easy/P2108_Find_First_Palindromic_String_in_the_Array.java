package uz.mkhasanov.arrays.easy;

import java.text.ParseException;

public class P2108_Find_First_Palindromic_String_in_the_Array {

    public static void main(String[] args) throws ParseException {
        System.out.println(firstPalindrome(new String[]{"abc","car","ada","racecar","cool"}));

//        System.out.println(isPalindromic("ada"));
//        System.out.println(isPalindromic("adada"));
//        System.out.println(isPalindromic("adda"));
    }

    public static String firstPalindrome(String[] words) {
        for (String word : words) {
            if (isPalindromic(word)){
                return word;
            }
        }
        return "";
    }

    public static boolean isPalindromic(String s){
        int l = s.length();
        for (int i = 0; i < l/2; i++) {
            if (s.charAt(i)!=s.charAt(l-i-1)){
                return false;
            }
        }

        return true;
    }



}
