package uz.mkhasanov;

public class P204_Count_Primes {
    public static void main(String[] args) {
        System.out.println(countPrimes((int) (5 * Math.pow(10, 6))));
        System.out.println(countPrimes(10));

//        System.out.println(isPrime(0));
//        System.out.println(isPrime(1));
//        System.out.println(isPrime(2));
//        System.out.println(isPrime(3));
//        System.out.println(isPrime(4));
//        System.out.println(isPrime(10));
//        System.out.println(isPrime(11));
//        System.out.println(isPrime(12));
//        System.out.println(isPrime(13));
//        System.out.println(isPrime(9));
//        System.out.println(isPrime(53));
//        System.out.println(isPrime(1925899));
    }

    public static int countPrimes(int n) {
        int count = 0;
        for (int i = 2; i < n; i++) {
            if (isPrime(i)) {
                count++;
//                System.out.println(i);
            }
        }

        return count;
    }

    public static boolean isPrime(int a) {
        if ((a % 2 == 0 && a > 2) || a < 2)
            return false;

        for (int i = 3; i * i <= a; i += 2) {
            if (a % i == 0)
                return false;
        }

        return true;
    }


}
