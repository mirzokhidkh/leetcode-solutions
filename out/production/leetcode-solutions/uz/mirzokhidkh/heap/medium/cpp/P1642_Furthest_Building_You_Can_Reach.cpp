class Solution {
public:
    int furthestBuilding(vector<int>& heights, int bricks, int ladders) {

        int i;
        for(i=0; i<heights.size()-1; i++){
            if(heights[i+1] <= heights[i]){
                continue;
            }

            if(bricks == 0 && ladders == 0 ){
                return i;
            }


            int dif = heights[i+1]-heights[i];

            if(bricks >= dif){
                bricks -= dif;
            }else if(ladders != 0){
                --ladders;
            }
        }

        return i;
    }
};