package uz.mkhasanov.number.easy;

public class P204_Count_Primes {
    public static void main(String[] args) {
        System.out.println(countPrimes((int) (5 * Math.pow(10, 6))));
        System.out.println(countPrimes(10));
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
