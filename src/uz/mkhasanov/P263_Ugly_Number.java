package uz.mkhasanov;

import java.util.ArrayList;
import java.util.List;

public class P263_Ugly_Number {
    public static void main(String[] args) {

//        System.out.println(isUgly(6));
//        System.out.println(isUgly(8));
//        System.out.println(isUgly(14));

//        System.out.println(isPrime(1));
//        System.out.println(isPrime(2));
//        System.out.println(isPrime(3));
//        System.out.println(isPrime(4));
//        System.out.println(isPrime(5));
//        System.out.println(isPrime(9));
//        System.out.println(isPrime(11));
//        System.out.println(isPrime(53));
    }

    public static boolean isUgly(int n) {
        if (n == 1) {
            return true;
        } else if (n <= 0) {
            return false;
        }
        List<Integer> primes = new ArrayList<Integer>() {{
            add(2);
            add(3);
            add(5);
        }};

        boolean hasPrime = false;

        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                if (isPrime(i)) {
                    hasPrime = true;
                    if (!primes.contains(i)) {
                        return false;
                    }
                }
            }
        }

        return hasPrime;
    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        } else if (n == 1 || (n % 2 == 0)) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

}
