package uz.mirzokhidkh;

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<>();

        int squareNum=1, j=3;
        while(squareNum<=12){
            queue.offer(squareNum);
            squareNum+=j;
            j+=2;
        }

        System.out.println(queue);
        System.out.println(queue.contains(1));



//        String[] deadends = new String[]{"1212"};
//        Set<String> set = new HashSet<>(Arrays.asList(deadends));

//        System.out.println(set.contains("1221"));

    }


}
