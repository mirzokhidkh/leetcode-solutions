package uz.mirzokhidkh;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        System.out.println("abs".substring(3));
        int i = '9'-'0';
        System.out.println("11"+(i-1)+"1");
        System.out.println("11"+'9'+"1");

        String lock = "11";

        Queue<Queue<String>> queue = new LinkedList<>();
        Queue<String> q = new LinkedList<>();
        q.offer(lock);
        queue.offer(q);
        System.out.println((Collections.singletonList("s")));

//        String[] deadends = new String[]{"1212"};
//        Set<String> set = new HashSet<>(Arrays.asList(deadends));

//        System.out.println(set.contains("1221"));

    }


}
