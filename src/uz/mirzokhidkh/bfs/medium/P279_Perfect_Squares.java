package uz.mirzokhidkh.bfs.medium;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class P279_Perfect_Squares {

    public int numSquares(int n) {

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        int squareNumb = 1, i = 3; // 1+(3)=4; 4+(3+1*2)=9; 9+(3+2*2)=16; 16+(3+3*2)=25, ...
        while (squareNumb <= n) {
            queue.offer(squareNumb);
            visited.add(squareNumb);
            squareNumb += i;
            i += 2;
        }

        int level = 1;

        while (!queue.isEmpty()) {

            int size = queue.size();

            while (size-- > 0) {

                Integer num = queue.poll();
                if (num == n) {
                    return level;
                }

                squareNumb = 1;
                i = 3;
                while (num + squareNumb <= n) {

                    if (visited.add(num + squareNumb)) {
                        queue.offer(num + squareNumb);
                    }

                    squareNumb += i;
                    i += 2;
                }

            }

            level++;
        }

        return 1;
    }


}
