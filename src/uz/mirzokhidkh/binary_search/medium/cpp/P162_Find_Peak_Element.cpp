class Solution {
public:
    int findPeakElement(vector<int>& nums) {
         return binarySearch(nums,0,nums.size()-1);
    }

    int binarySearch(vector<int>& nums, int l, int r){

        int m = l + (r-l)/2;

        if(m > 0 && nums[m] < nums[m-1]){
            return binarySearch(nums,l,m-1);
        }else if(m < nums.size()-1 && nums[m] < nums[m+1]){
            return binarySearch(nums,m+1,r);
        }else{
            return m;
        }

    }

};