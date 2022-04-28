package uz.mirzokhidkh.number.easy;

public class P263_Ugly_Number {
    public static void main(String[] args) {

        System.out.println(isUgly(6));
        System.out.println(isUgly(8));
        System.out.println(isUgly(14));
        System.out.println(isUgly(1332185066));

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

        int[] factors = new int[]{2, 3, 5};

        for (int factor : factors) {
            while (n > 1 && n % factor == 0) {
                n /= factor;
            }
        }


        return n == 1;
    }


}
