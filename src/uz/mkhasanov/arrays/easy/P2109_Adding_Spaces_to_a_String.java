package uz.mkhasanov.arrays.easy;

import java.text.ParseException;

public class P2109_Adding_Spaces_to_a_String {

    public static void main(String[] args) throws ParseException {

        System.out.println(addSpaces("LeetcodeHelpsMeLearn", new int[]{8, 13, 15}));
        System.out.println(addSpaces("spacing", new int[]{0, 1, 2, 3, 4, 5, 6}));
        System.out.println(addSpaces("BtOUNZ", new int[]{0, 3}));
        System.out.println(addSpaces("icodeinpython", new int[]{1, 5, 7, 9}));

    }

    //APPROACH-1
    public static String addSpaces(String s, int[] spaces) {
        StringBuilder res = new StringBuilder();
        int i;
        res.append(s, 0, spaces[0]).append(" ");
        for (i = 1; i < spaces.length; i++) {
            res.append(s, spaces[i - 1], spaces[i]).append(" ");
        }
        res.append(s.substring(spaces[i - 1]));

        return res.toString();
    }


    //APPROACH-2
    public static String addSpaces2(String s, int[] spaces) {
        StringBuilder res = new StringBuilder();
        int i = 0;
        int n = spaces.length;
        res.append(s, 0, spaces[0]).append(" ");
        res.append(s.substring(spaces[n - 1]));

        if (n > 1)
            for (i = 1; i <= n / 2; i++) {
                String font = res.substring(0, spaces[i - 1] + i);
                String back = res.substring(spaces[i - 1] + i);
                res = new StringBuilder(font);
                res
                        .append(s, spaces[i - 1], spaces[i])
                        .append(" ");

                if (n - i > n / 2) {
                    res
                            .append(s, spaces[n - i - 1], spaces[n - i])
                            .append(" ")
                            .append(back);
                } else {
                    res
                            .append(back);
                }

            }
        return res.toString();
    }

}
