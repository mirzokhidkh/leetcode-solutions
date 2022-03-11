package uz.mkhasanov.string.easy;

public class P14_Longest_Common_Prefix {

    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"flower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"reflower", "flow", "flight"}));
        System.out.println(longestCommonPrefix(new String[]{"aaa", "aa", "aaa"}));
    }

    public static String longestCommonPrefix(String[] strs) {
        String a = strs[0];
        if (strs.length == 1) return a;
        for (int i = 1; i < strs.length; i++) {
            String s = strs[i];
            int j;
            int l = Math.min(s.length(), a.length());
            for (j = 0; j < l; j++) {
                if (a.charAt(j) != s.charAt(j)) {
                    break;
                }
            }
            a = s.substring(0, j);
            if (i == strs.length - 1)
                return a.substring(0, j);
        }
        return "";
    }

}
