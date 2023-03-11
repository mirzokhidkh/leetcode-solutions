class Solution {
public:
    int lastStoneWeight(vector<int>& stones) {
        priority_queue<int> pq;

        for(int i : stones){
            pq.push(i);
        }

        while(!pq.empty()){
            int y = pq.top();
            pq.pop();

            if(pq.empty()){
                return y;
            }
            int x = pq.top();
            pq.pop();

            if(x < y){
                pq.push(y-x);
            }
        }



        return 0;
    }
};