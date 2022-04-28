package uz.mirzokhidkh.two_pointers.easy;

import java.util.Objects;

public class P557_Reverse_Words_in_a_String_III {

    public static void main(String[] args) {
        String s = reverseWords("Let's take LeetCode contest");
        System.out.println(s);
        System.out.println("s'teL ekat edoCteeL tsetnoc");
        System.out.println(Objects.equals(s, "s'teL ekat edoCteeL tsetnoc"));

    }

    public static String reverseWords(String s) {
        StringBuilder res = new StringBuilder();
        int n = s.length();

        for (int i = 0; i < n; i++) {

            int j = s.indexOf(" ", i);

            res.append(reverse(s.substring(i, j != -1 ? j : n))).append(" ");

            if (j != -1) {
                i = j;
            } else {
                break;
            }

        }
        return res.substring(0, res.length() - 1);
    }


    public static String reverse(String s) {
        char[] chars = s.toCharArray();
        int start = 0, end = chars.length - 1;

        while (start < end) {
            char temp = chars[start];
            chars[start] = chars[end];
            chars[end] = temp;
            start++;
            end--;
        }

        return String.valueOf(chars);
    }

}
