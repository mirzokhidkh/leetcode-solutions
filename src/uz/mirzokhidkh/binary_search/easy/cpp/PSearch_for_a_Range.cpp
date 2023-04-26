class Solution {
public:
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> res;

        int ind = binarySearch(nums,target,0,nums.size()-1);




       // return res;
        return {-1,-1};
    }

    int binarySearch(vector<int>& nums, int x, int l, int r){
        if(l <= r){
            int m = l + (r - l)/2;

             if(nums[m] == x){
                 return m;
             }else if(nums[m] < x){
                 return binarySearch(nums,x,m+1,r)
             }else{
                 return binarySearch(nums,x,l,m-1);
             }
        }
        return -1;
    }

};