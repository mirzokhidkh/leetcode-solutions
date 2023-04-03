#include <algorithm>
class Solution {
public:
    int furthestBuilding(vector<int>& heights, int bricks, int ladders) {
        priority_queue<int> maxHeap;

        //PLAN
        //find all variations and push index to maxHeap step by step until there are no ladders and bricks
        //finally return the top of th maxHeap which the furthest building index

        helper(heights,0,bricks,ladders,maxHeap)
        return maxHeap.top();
    }

    int helper(vector<int>& heights,int i, int bricks, int ladders){


    }


};


//class Solution {
//public:
//    int furthestBuilding(vector<int>& heights, int bricks, int ladders) {
//
//        int i;
//        for(i=0; i<heights.size()-1; i++){
//            if(heights[i+1] <= heights[i]){
//                continue;
//            }
//
//            if(bricks == 0 && ladders == 0 ){
//                return i;
//            }
//
//
//            int dif = heights[i+1]-heights[i];
//
//            if(bricks >= dif){
//                bricks -= dif;
//            }else if(ladders != 0){
//                --ladders;
//            }
//        }
//
//        return i;
//    }
//};
//
