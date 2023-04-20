class Solution {
public:
    int search(vector<int>& nums, int target) {
        return binarySearch(nums, target, 0, nums.size()-1);
    }

    int binarySearch(vector<int>& nums, int x, int l, int r){

        if(l <= r){
            int m = l + (r-l)/2;

            if(nums[m] == x){
                return m;
            }else if(x > nums[m]){
                return binarySearch(nums,x,m+1,r);
            }else{
                return binarySearch(nums,x,l,m-1);
            }

        }
        return -1;
    }
};