class Solution {
public:
    int findMin(vector<int>& nums) {
        int l = 0, r = nums.size()-1;

        while(l < r){
            int m = l + (r - l)/2;

            if(nums[m] >= nums[l] && nums[m] > nums[r]){
                l = m+1;
            }else{
                r = m;
            }
        }
        return nums[l];
    }


    // APPROACH-2
     int findMin2(vector<int>& nums) {

            if(nums.size() == 1){
                return nums[0];
            }

            int l = 0, r = nums.size()-1;

            if(nums[r] > nums[0]){
                return nums[0];
            }

            while(l < r){
                int m = l + (r - l)/2;

                if(nums[m] >= nums[0]){
                    l = m + 1;
                }else{
                    r = m;
                }
            }

            return nums[l];
        }


};