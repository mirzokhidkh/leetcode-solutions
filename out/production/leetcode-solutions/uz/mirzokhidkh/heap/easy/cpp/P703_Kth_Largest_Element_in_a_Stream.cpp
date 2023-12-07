package uz.mirzokhidkh.heap.easy.cpp;

public class P703_Kth_Largest_Element_in_a_Stream {


}



/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest* obj = new KthLargest(k, nums);
 * int param_1 = obj->add(val);
 */
    class KthLargest {
        public:
        priority_queue<int> pq;
        // priority_queue<int,vector<int>,greater<int>> pq();

        int c;
        KthLargest(int k, vector<int>& nums) {
            c = k;

            for(int num:nums){
                pq.push(num);
            }
            // pq =
        }

        int add(int val) {
            vector<int> temp;

            pq.push(val);
            int i = c;
            int kthLargest  = 0;

            while(i > 0){
                kthLargest = pq.top();
                temp.push_back(kthLargest);
                pq.pop();
                i--;
            }

            for(int num:temp){
                pq.push(num);
            }

            return kthLargest ;
        }


    };
