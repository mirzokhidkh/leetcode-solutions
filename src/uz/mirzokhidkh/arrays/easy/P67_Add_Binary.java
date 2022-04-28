package uz.mirzokhidkh.arrays.easy;

import java.math.BigDecimal;
public class P67_Add_Binary {
    public static void main(String[] args) {

        System.out.println(addBinary("11", "1"));
        System.out.println("110111101100010011000101110110100000011101000101011001000011011000001100011110011010010011000000000".equals(
                addBinary("10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011")));
    }


    public static String addBinary(String a, String b) {
        return getBinary(getDecimal(a).add(getDecimal(b)));
    }


    public static BigDecimal getDecimal(String a) {
        BigDecimal res = new BigDecimal(0);
        char[] arr = a.toCharArray();
        for (int i = arr.length - 1; i >= 0; i--) {
            res = res.add(new BigDecimal("2").pow(arr.length - 1 - i)
                    .multiply(BigDecimal.valueOf(Long.parseLong(arr[i] + ""))));
        }
        return res;
    }

    public static String getBinary(BigDecimal a) {
        StringBuilder res = new StringBuilder();
        while (a.compareTo(BigDecimal.valueOf(2)) >= 0) {
            res.append(a.remainder(BigDecimal.valueOf(2)));
            a = a.divide(BigDecimal.valueOf(2)).setScale(0, BigDecimal.ROUND_HALF_DOWN);
        }
        res.append(a);
        return res.reverse().toString();
    }
}
