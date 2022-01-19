package uz.mkhasanov;

import javafx.util.Pair;

import java.text.ParseException;
import java.util.*;

public class P752_Open_the_Lock {

    public static void main(String[] args) throws ParseException {

        System.out.println(openLock(new String[]{"0201", "0101", "0102", "1212", "2002"}, "0202"));
        System.out.println(openLock(new String[]{"8888"}, "0009"));
        System.out.println(openLock(new String[]{"8887", "8889", "8878", "8898", "8788", "8988", "7888", "9888"}, "8888"));
    }


    public static int openLock(String[] deadends, String target) {
        Set<String> deadendSet = new HashSet<>(Arrays.asList(deadends));
        String s = "0000";

        Set<String> visited = new HashSet<>();
        visited.add(s);
        Queue<String> queue = new LinkedList<>();
        queue.offer(s);

        int level = 0;

        while (!queue.isEmpty()) {

            int size = queue.size();
            System.out.println("SIZE=" + size);
            while (size-- > 0) {
                String lockPos = queue.poll();

                if (deadendSet.contains(lockPos)) {
                    continue;
                }
                assert lockPos != null;
                if (lockPos.equals(target)) {
                    return level;
                }

                StringBuilder sb = new StringBuilder(lockPos);
                for (int i = 0; i < 4; i++) {
                    char curPos = sb.charAt(i);

                    String s1 = sb.substring(0, i) + (curPos == '9' ? 0 : curPos - '0' + 1) + sb.substring(i + 1);
                    String s2 = sb.substring(0, i) + (curPos == '0' ? 9 : curPos - '0' - 1) + sb.substring(i + 1);

                    if (!deadendSet.contains(s1) && !visited.contains(s1)) {
                        queue.offer(s1);
                        visited.add(s1);

                    }
                    if (!deadendSet.contains(s2) && !visited.contains(s2)) {
                        queue.offer(s2);
                        visited.add(s2);
                    }
                }
            }
            level++;
        }
        return -1;
    }


}
