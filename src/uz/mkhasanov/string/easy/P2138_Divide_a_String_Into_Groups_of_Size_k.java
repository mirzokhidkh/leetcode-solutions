package uz.mkhasanov.string.easy;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static com.sun.org.apache.xml.internal.security.keys.keyresolver.KeyResolver.length;

public class P2138_Divide_a_String_Into_Groups_of_Size_k {

    public static void main(String[] args) throws ParseException {
        System.out.println(Arrays.toString(divideString("abcdefghi", 3, 'x')));
        System.out.println(Arrays.toString(divideString("abcdefghij", 3, 'x')));
    }

    public static String[] divideString(String s, int k, char fill) {
        List<String> arr = new ArrayList<>();
        int i = 0;
        for (i = 0; i <= s.length() - k; i += k) {
            arr.add(s.substring(i, i + k));
        }
        if (i < s.length())
        arr.add(s.substring(i));
        int l = arr.get(arr.size() - 1).length();
        if (l < k) {
            for (int j = 0; j < k - l; j++) {
                arr.set(arr.size() - 1, arr.get(arr.size() - 1) + fill);
            }
        }

        return arr.toArray(new String[0]);
    }


}
