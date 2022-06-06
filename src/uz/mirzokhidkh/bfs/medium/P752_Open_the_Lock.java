package uz.mirzokhidkh.bfs.medium;

import java.util.*;

public class P752_Open_the_Lock {

    public int openLock(String[] deadends, String target) {

        Set<String> deadendSet = new HashSet<>(Arrays.asList(deadends));
        String str = "0000";

        Set<String> visited = new HashSet<>();
        int step = 0;


        Queue<String> queue = new LinkedList<>();
        queue.offer(str);

        while (!queue.isEmpty()) {

            int size = queue.size();

            while (size-- > 0) {

                String curLock = queue.poll();

                if (deadendSet.contains(curLock)) {
                    continue;
                } else if (curLock.equals(target)) {
                    return step;
                }


                for (int i = 0; i < 4; i++) {

                    char curDigit = curLock.charAt(i);
                    int nextDigit = curDigit - '0';

                    String downLock = curLock.substring(0, i) + (nextDigit != 9 ? (nextDigit + 1) : 0) + curLock.substring(i + 1); //'0000' ==> 1000
                    String upLock = curLock.substring(0, i) + (nextDigit != 0 ? (nextDigit - 1) : 9) + curLock.substring(i + 1);   //'0000' ==> 9000

                    if (!visited.contains(downLock)) {
                        queue.offer(downLock);
                        visited.add(downLock);
                    }
                    if (!visited.contains(upLock)) {
                        queue.offer(upLock);
                        visited.add(upLock);
                    }

                }

            }
            step++;

        }

        return -1;

    }


}
