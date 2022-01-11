package uz.mkhasanov;

import java.text.ParseException;

public class P917_Reverse_Only_Letters {

    public static void main(String[] args) throws ParseException {
        System.out.println(reverseOnlyLetters("ab-cd"));
        System.out.println(reverseOnlyLetters("a-bC-dEf-ghIj"));
        System.out.println(reverseOnlyLetters("Test1ng-Leet=code-Q!"));
    }


    public static String reverseOnlyLetters(String s) {

        int start = 0, end = s.length() - 1;
        char[] chars = s.toCharArray();

        while (start < end) {
            char a = chars[start], b = chars[end];

            if (Character.isLetter(a) && Character.isLetter(b)) {
                swap(chars, start, end);
                start++;
                end--;
            }

            else if (!Character.isLetter(a)) {
                start++;
            }

            else if (!Character.isLetter(b)) {
                end--;
            }
        }

        return String.valueOf(chars);
    }

    public static void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
