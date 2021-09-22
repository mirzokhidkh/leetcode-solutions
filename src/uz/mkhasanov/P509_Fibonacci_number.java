package uz.mkhasanov;

import java.util.Arrays;

public class P509_Fibonacci_number {
    public static void main(String[] args) {

        System.out.println(fib(0));
        System.out.println(fib(1));
        System.out.println(fib(2));
        System.out.println(fib(3));
        System.out.println(fib(4));
        System.out.println(fib(5));

    }

    public static int fib(int n) {
        int[] arr = new int[]{0, 1};
        if (n < 1) {
            return arr[n];
        } else if (n + 1 > arr.length) {
            arr = Arrays.copyOf(arr, n + 1);
        }
        fibonacci(2, arr);
        return arr[n];
    }

    public static void fibonacci(int pos, int[] arr) {
        if (pos + 1 > arr.length)
            return;
        arr[pos] = arr[pos - 1] + arr[pos - 2];
        fibonacci(pos + 1, arr);
    }
}
