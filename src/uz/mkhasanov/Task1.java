package uz.mkhasanov;

import java.util.Arrays;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(getArrayBy("aa#bb#ccc#qqq")));
    }

    public static String[] getArrayBy(String str) {
        int len = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                ++len;
            }
        }
        System.out.println("There are " + len + " character '#' in string");
//        System.out.println(str.indexOf('#'));
        String[] arr = new String[len + 1];
        int j = 0;
        int lastInd = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '#') {
                arr[j++] = str.substring(lastInd, i);
                lastInd = i + 1;
            }
        }

        arr[j] = str.substring(lastInd);
        return arr;
    }
}
