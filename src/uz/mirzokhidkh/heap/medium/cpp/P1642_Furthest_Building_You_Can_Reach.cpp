#include <algorithm>
class Solution {
public:
      int furthestBuilding(vector<int>& heights, int bricks, int ladders) {
        int n = heights.size();
        if(n == 1) return 0;

        priority_queue<int> pq;
        int i = 0;
        for( i = 0; i < n-1; i++){
            int diff = heights[i+1] - heights[i];
            if(diff > 0){
                if(ladders > 0){
                    pq.push(-diff);
                    ladders--;
                }else if(!pq.empty() && diff > -pq.top()){
                    bricks += pq.top();
                    pq.pop();
                    pq.push(-diff);
                }else{
                    bricks -= diff;
                }

                if(bricks < 0){
                    return i;
                }

            }
        }

        return n-1;
    }

};