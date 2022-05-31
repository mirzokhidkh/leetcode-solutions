package uz.mirzokhidkh;

import java.util.*;

public class Example {

    public static void main(String[] args) {

        char a = '1';
        Set<Integer> set = new HashSet<>();
        Queue<Integer[]> queue = new LinkedList<>();

        queue.add(new Integer[]{1,2});
        queue.add(new Integer[]{1,2});
        queue.add(new Integer[]{1,2});

        System.out.println(queue.poll());

        System.out.println(queue.peek());

        Integer[] peek = queue.peek();
        int size = queue.size();

        while (!queue.isEmpty())
        {

        }

    }


}
