package uz.mkhasanov;

import java.math.BigDecimal;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int n = Integer.MAX_VALUE;
        int c = 0;
        while (n > 0) {
            n /= 4;
            c++;
        }
        System.out.println(c);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Math.pow(2,31)-1);
        System.out.println(Math.pow(4,15)-1);
        System.out.println(Math.pow(4,15));
        System.out.println(2.147483647E9%4);
    }
}
