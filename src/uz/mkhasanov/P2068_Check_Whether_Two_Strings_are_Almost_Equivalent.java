package uz.mkhasanov;

public class P2068_Check_Whether_Two_Strings_are_Almost_Equivalent {
    public static void main(String[] args) {

        System.out.println(checkAlmostEquivalent("aaaa", "bccb"));//false
        System.out.println(checkAlmostEquivalent("abcdeef", "abaaacc")); //true
        System.out.println(checkAlmostEquivalent("cccddabba", "babababab"));//true
        System.out.println(checkAlmostEquivalent("zzzyyy", "iiiiii"));//false
        System.out.println(checkAlmostEquivalent(
                "yttnjqdknymzuneqesuagmbdlyaerihwtnomrxjeygbwhsudxcfiminvecgblhnbpuorgntntzmgz",
                "lsgwihmvznuaijslavjbwqpfnnjkbzvthuoiktlydvmnoyetdkuqrfoekzeqqvqfjwsjkiqllfibi"  // false
        ));

    }

    public static boolean checkAlmostEquivalent(String word1, String word2) {

        for (int i = 0; i < word1.length(); i++) {

            char c1 = word1.charAt(i);

            int a = countTheNumberForEachLetter(word1, c1, i + 1);
            int b = countTheNumberForEachLetter(word2, c1, 0);

            if (!isRepeated(word1, i, c1) && Math.abs(a - b) > 3) {
                return false;
            }

            char c2 = word2.charAt(i);

            if (!isRepeated(word2, i, c2)
                    && !isRepeated(word1, word1.length(), c2)
                    && countTheNumberForEachLetter(word2, c2, 0) > 3) {
                return false;
            }

        }
        return true;
    }

    private static boolean isRepeated(String s, int i, char c) {
        return s.substring(0, i).contains(c + "");
    }

    public static int countTheNumberForEachLetter(String s, char c, int pos) {
        if (!s.contains(c + "")) {
            return 0;
        }

        int count = pos != 0 ? 1 : 0;

        for (int j = pos; j < s.length(); j++) {
            if (c == s.charAt(j)) {
                count++;
            }
        }
        return count;
    }

}
