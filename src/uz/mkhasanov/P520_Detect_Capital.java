package uz.mkhasanov;

import java.io.IOException;
import java.text.ParseException;

public class P520_Detect_Capital {

    public static void main(String[] args) throws ParseException, IOException {
        System.out.println(detectCapitalUse("USA"));
        System.out.println(detectCapitalUse("leetcode"));
        System.out.println(detectCapitalUse("Google"));
        System.out.println(detectCapitalUse("FlaG"));


    }


    public static boolean detectCapitalUse(String word) {
        if (isAllCapitals(word))
            return true;
        else if (isAllSmalls(word))
            return true;
        else return isFirstCapital(word);
    }

    public static boolean isAllCapitals(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLowerCase(s.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean isAllSmalls(String s) {
        for (int i = 0; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                return false;
        }
        return true;
    }

    public static boolean isFirstCapital(String s) {
        if (!Character.isUpperCase(s.charAt(0))) {
            return false;
        }
        for (int i = 1; i < s.length(); i++) {
            if (Character.isUpperCase(s.charAt(i)))
                return false;
        }
        return true;
    }

}
