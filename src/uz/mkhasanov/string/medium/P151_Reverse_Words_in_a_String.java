package uz.mkhasanov.string.medium;

public class P151_Reverse_Words_in_a_String {
    public static void main(String[] args) {
        String s = "aa bb cc";
        String s2 = "  hello world  ";
        System.out.println(reverseWords(s));
        System.out.println(reverseWords(s2));
    }


    public static String reverseWords(String s) {
        String sb = clearExcessSpaces(s);
        StringBuilder res = new StringBuilder();

        for (int i = sb.length() - 1; i >= 0; i--) {

            int j = sb.lastIndexOf(" ", i);

            if (j != -1) {
                res.append(sb, j + 1, i + 1).append(" ");
                i = j;
            } else {
                res.append(sb, 0, i + 1);
                break;
            }
        }

        return res.toString();
    }

    // trim() method
    public static String clearExcessSpaces(String s) {
        int n = s.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {

            if (s.charAt(i) != ' ') {

                int j = s.indexOf(" ", i);

                if (j != -1) {
                    sb.append(s, i, j+1);
                    i = j;
                } else {
                    sb.append(s.substring(i));
                    break;
                }

            }
        }

            if (sb.toString().endsWith(" ")) {
            return sb.substring(0, sb.length() - 1);
        }
        return sb.toString();
    }

}
