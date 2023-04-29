class Solution {
public:

    //1-approah binary search + iterative. TC : O(lg(n+2^n))
    vector<int> searchRange(vector<int>& nums, int target) {
        vector<int> res;

        int ind = binarySearch(nums,target,0,nums.size()-1);

        if(ind != -1){
            if(nums.size() == 1){
                return {0,0};
            }
            int l = ind-1;
            while(l >= 0 && nums[ind] == nums[l]){
                l--;
            }
            res.push_back(l+1);

            int r = ind+1;
            while(r <= nums.size()-1 && nums[ind] == nums[r]){
                r++;
            }
            res.push_back(r-1);
            return res;
        }
        return {-1,-1};
    }

    int binarySearch(vector<int>& nums, int x, int l, int r){
        if(l <= r){
            int m = l + (r - l)/2;

             if(nums[m] == x){
                 return m;
             }else if(nums[m] < x){
                 return binarySearch(nums,x,m+1,r);
             }else{
                 return binarySearch(nums,x,l,m-1);
             }
        }
        return -1;
    }



    //2-Custom Binary Search

    vector<int> searchRange(vector<int>& nums, int target) {
            int left = binarySearch(nums,target,true);
            int right = binarySearch(nums,target,false);
            return {left,right};
        }

        int binarySearch(vector<int>& nums, int x, bool leftBias){
            int l = 0, r = nums.size()-1;
            int i = -1;

            while(l <= r){

                int m = l + (r - l)/2;

                if(nums[m] == x){
                    i = m;
                    if(leftBias){
                        r = m-1;
                    }else{
                        l = m+1;
                    }
                }else if(nums[m] < x){
                    l = m+1;
                }else{
                    r = m-1;
                }
            }

            return i;
        }

};