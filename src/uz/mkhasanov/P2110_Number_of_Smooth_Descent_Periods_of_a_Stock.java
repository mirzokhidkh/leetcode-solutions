package uz.mkhasanov;

import java.text.ParseException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class P2110_Number_of_Smooth_Descent_Periods_of_a_Stock {

    public static void main(String[] args) throws ParseException {

        int[] arr = new int[100000];

        AtomicInteger i = new AtomicInteger();
        Stream.iterate(1, element -> element + 1)
                .limit(100000)
                .forEach(integer -> arr[i.getAndIncrement()] = integer);
        int[] reversedArr = IntStream.rangeClosed(1, arr.length).map(j -> arr[arr.length - j]).toArray();

        System.out.println(getDescentPeriods(new int[]{3, 2, 1, 4}));//7
        System.out.println(getDescentPeriods(new int[]{8, 6, 7, 7}));//4
        System.out.println(getDescentPeriods(new int[]{12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 4, 3, 10, 9, 8, 7}));//68
        System.out.println(getDescentPeriods(reversedArr));//5000050000
    }

    public static long getDescentPeriods(int[] prices) {
            long count = 1;
            long k = 1;

            for (int i = 1; i < prices.length; i++) {
                if (prices[i] == prices[i - 1] - 1) {
                    k++;
                    count += k;
                } else {
                    ++count;
                    k = 1;
                }
            }
            return count;
    }


}
