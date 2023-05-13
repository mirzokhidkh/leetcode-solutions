class Solution {
public:
    int findMin(vector<int>& nums) {
        if(nums.size() == 1){
            return nums[0];
        }

        int l = 0, r = nums.size()-1;

        if(nums[r] > nums[0]){
            return nums[0];
        }

        while(l < r){
            int m = l + (r - l)/2;

            if(nums[m] > nums[r]){
                l = m + 1;
            }else if(nums[m] < nums[l]){
                r = m;
            }else{
                r -= 1;
            }
        }

        return nums[l];
    }
};