package uz.mirzokhidkh.heap.medium;

import java.util.Collections;
import java.util.PriorityQueue;

public class P215_Kth_Largest_Element_in_an_Array {
    public static void main(String[] args) {

//        PriorityQueue<Integer> maxHeap = new PriorityQueue<>();


    }

    public int findKthLargest(int[] nums, int k) {

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for(int num : nums){
            maxHeap.add(num);
        }

        while(k-- > 1 ){
            maxHeap.poll();
        }

        
        return maxHeap.poll();
    }

}
