package uz.mkhasanov.string.easy;

public class P796_Rotate_String {
    public static void main(String[] args) {
        System.out.println(rotateString("abcde", "cdeab"));
        System.out.println(rotateString("abcde", "abced"));
    }

    public static boolean rotateString(String s, String goal) {

        for (int i = 0; i < s.length(); i++) {
            if (s.equals(goal))
                return true;
            System.out.println(s);
            s = s.substring(1).concat(String.valueOf(s.charAt(0)));
        }

        return false;
    }
}
