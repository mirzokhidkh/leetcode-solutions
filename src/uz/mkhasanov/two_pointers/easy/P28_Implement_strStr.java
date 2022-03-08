package uz.mkhasanov.two_pointers.easy;

public class P28_Implement_strStr {
    public int strStr(String haystack, String needle) {
        int l1 = haystack.length();
        int l2 = needle.length();
        if (haystack.equals(needle) || needle.equals("")) return 0;
        if (l2 > l1) return -1;
        for (int i = 0; i < l1; i++) {
            if (haystack.charAt(i) == needle.charAt(0)) {
                int j;
                for (j = 1; j < l2; j++) {
                    if (i + j < l1 && i + l2 - j < l1) {
                        if (haystack.charAt(i + j) != needle.charAt(j) || haystack.charAt(i + l2 - j) != needle.charAt(l2 - j))
                            break;
                    } else {
                        j = -1;
                        break;
                    }
                }
                if (j == l2) return i;
            }
        }
        return -1;
    }
}
