package uz.mirzokhidkh.heap.easy;

import java.util.PriorityQueue;

public class P703_Kth_Largest_Element_in_a_Stream {

}
class KthLargest {
    PriorityQueue<Integer> pq = new PriorityQueue();
    int c;

    public KthLargest(int k, int[] nums) {
        c = k;
        int j = 0;

        for(int el : nums){
            if(j++ < k){
                pq.add(el);
            }else {
                compareCurrWithTheTop(el);
            }
        }
    }

    public int add(int val) {
        if(pq.size() < c){
            pq.add(val);
        }else{
            compareCurrWithTheTop(val);
        }
        return pq.peek();
    }

    private void compareCurrWithTheTop(int val){
        if(val > pq.peek()){
            pq.poll();
            pq.add(val);
        }
    }


}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */