package uz.mirzokhidkh.recursion.easy;

import java.util.HashMap;

public class P509_Fibonacci_Number {
    
    HashMap<Integer, Integer> cache = new HashMap<>();

    public int fib(int n) {
        if (cache.containsKey(n)) return cache.get(n);
        int res = 0;
        if (n < 2) {
            res = n;
        } else {
            res = fib(n - 1) + fib(n - 2);
        }
        cache.put(n, res);
        return res;
    }

}
