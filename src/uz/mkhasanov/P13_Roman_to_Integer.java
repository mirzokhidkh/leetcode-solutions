package uz.mkhasanov;

import java.util.HashMap;
import java.util.Map;

public class P13_Roman_to_Integer {



    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
        System.out.println(romanToInt("IV"));
        System.out.println(romanToInt("IX"));
        System.out.println(romanToInt("LVIII"));
        System.out.println(romanToInt("MCMXCIV"));

    }

    static Map<String, Integer> map = new HashMap<String, Integer>() {
        {
            put("I", 1);
            put("V", 5);
            put("X", 10);
            put("L", 50);
            put("C", 100);
            put("D", 500);
            put("M", 1000);
        }
    };

    public static int romanToInt(String s) {
        int len = s.length();
        int res = 0;

        for (int i = len - 1; i >= 0; i--) {
            Integer numb = map.get(String.valueOf(s.charAt(i)));
            if (i > 0) {
                Integer prevNumb = map.get(String.valueOf(s.charAt(i - 1)));
                if (numb > prevNumb) {
                    res += numb - prevNumb;
                    i--;
                }else {
                    res += numb;
                }
            } else {
                res += numb;
            }
        }
        return res;
    }
}
