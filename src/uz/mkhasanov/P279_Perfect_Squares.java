package uz.mkhasanov;

import java.text.ParseException;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class P279_Perfect_Squares {

    public static void main(String[] args) throws ParseException {
        System.out.println(numSquares(12));//3 ==>  4+4+4=12
        System.out.println(numSquares(13));//2 ==> 4+9=0
        System.out.println(numSquares(6366));// ==> 3
    }

    public static int numSquares(int n) {
        Set<Integer> visited = new HashSet<>();
        visited.add(n);
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);

        int level = 0;

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                Integer curVal = queue.poll();
                if (curVal == 0) {
                    return level;
                }
                int i = 1, squareNum = 0;

                while (squareNum <= curVal) {
                    squareNum += i;
                    int newVal = curVal - squareNum;

                    if (newVal < 0) {
                        break;
                    }

                    if (visited.add(newVal)) {
                        queue.offer(newVal);
                    }
                    i += 2;
                }

            }
            level++;
        }

        return 1;
    }

}
