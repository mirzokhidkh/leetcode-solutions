package uz.mkhasanov;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        String s = "52";

        String sq = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Integer.parseInt(String.valueOf(s.charAt(i))) % 2 != 0) {
                for (int j = 0; j < i+1; j++) {
                    sq = s.substring(j, i+1);
                    if ((Integer.parseInt(sq.substring(sq.length() - 1)) % 2 != 0)) {
                        System.out.println(sq);
                    }
                }
            }
        }


    }

    public String largestOddNumber(String num) {
        String s = num;
        String sq = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Integer.parseInt(String.valueOf(s.charAt(i))) % 2 != 0) {
                for (int j = 0; j < i; j++) {
                    sq = num.substring(j, i);
                    if ((Integer.parseInt(sq.substring(sq.length() - 1)) % 2 != 0)) {
                        return sq;
                    }
                }
            }
        }
        return "";

    }
}