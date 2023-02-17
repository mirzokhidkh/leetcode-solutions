package uz.mirzokhidkh.heap;

import java.util.PriorityQueue;

public class HeapMain {
    public static void main(String[] args) {

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        minHeap.add(6);
        minHeap.add(1);
        minHeap.add(4);

        System.out.println(minHeap.peek());

        System.out.println("minHeap: "+minHeap.toString());
    }
}
