package uz.mkhasanov;

public class P859_Buddy_Strings {
    public static void main(String[] args) {
        System.out.println(buddyStrings("aaaaaaabc", "aaaaaaacb"));
        System.out.println(buddyStrings("ab", "ab"));
        System.out.println(buddyStrings("aa", "aa"));
//        System.out.println(swap(0,3,"abcd"));
    }

    public static boolean buddyStrings(String s, String goal) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                String swappedS = swap(i, j, s);
                if (swappedS.equals(goal)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static String swap(int i, int j, String str) {
        char temp = str.charAt(i);
        str = str.substring(0, i) + str.charAt(j) + str.substring(i + 1, j) + temp + str.substring(j + 1);
        return str;
    }
}
