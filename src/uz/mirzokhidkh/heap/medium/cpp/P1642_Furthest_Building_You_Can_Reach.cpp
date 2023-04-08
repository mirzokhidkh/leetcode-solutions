#include <algorithm>
class Solution {
public:
      int furthestBuilding(vector<int>& heights, int bricks, int ladders) {
        int n = heights.size();
        if(n == 1) return 0;

        priority_queue<int> pq;

        for(int i = 0; i < n-1; i++){
            int diff = heights[i+1] - heights[i];
            if(diff > 0){
                if(ladders > 0){
                    pq.push(diff);
                    ladders--;
                }else if(bricks > 0 && !pq.empty() && diff > pq.top() && bricks >= pq.top()){
                    bricks -= pq.top();
                    pq.pop();
                    pq.push(diff);
                }else if(bricks >= diff){
                    bricks -= diff;
                }else{
                    break;
                }
            }
        }

        return pq.top();
    }
//    int furthestBuilding(vector<int>& heights, int bricks, int ladders) {
//        priority_queue<int> maxHeap;
//
//        //RECURSIVE APPROACH
//        //1 => find all variations and push index to maxHeap step by step until there are no ladders and bricks
//
//        //2 => finally return the top of th maxHeap which the furthest building index
//
//        return helper(heights,0,bricks,ladders);
//        // return maxHeap.top();
//        // return max(2,3);
//    }
//
//    int helper(const vector<int>& h,int i, int b, int l){
//        int n = h.size();
//
//
//        if((b <= 0 && l == 0 && (h[i+1] - h[i]) > 0) || i == n-1){
//            return i;
//        }
//        int dif = h[i+1] - h[i];
//
//        if(dif > 0){
//            int v1 = 0,v2 = 0;
//            if(b > 0 && b >= dif){
//                v1 = helper(h,i+1,b-dif,l);
//            }else if(l == 0){
//                 v1 = i;
//            }
//
//            if(l > 0){
//                v2 = helper(h,i+1,b,l-1);
//            }
//
//            return max(v1,v2);
//        }else if(b >= 0 || l >= 0){
//            return helper(h,i+1,b,l);
//        }
//       return -1;
//    }

};