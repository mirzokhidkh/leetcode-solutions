class Solution {
public:

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

      int binarySearch(vector<int>& arr, int x){
            if (arr.size() == 0){
                return -1;
            }
            int l = 0, r = arr.size()-1;
            while(l <= r){
                int m = l + (r - l)/2;
                if(arr[m] == x){
                    return m;
                }else if(arr[m] < x){
                    l = m+1;
                }else{
                    r = m-1;
                }
            }
            return -1;
        }

};