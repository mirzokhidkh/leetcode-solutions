class Solution {
public:
    vector<int> findClosestElements(vector<int>& arr, int k, int x) {
        vector<int> res;
        int ind = binarySearch(arr,x,0,arr.size()-1);
        if(ind != -1){
            int l = ind - k/2;
            while(l < ind+1){
                res.push_back(arr[l]);
                l++;
            }
            int r = ind+1;
            int s = r + (k%2 == 0 ? k/2-1 : k/2);
            while(r < s){
                res.push_back(arr[r]);
                r++;
            }
        }else{
            int i = 0;
            while(i<k){
                res.push_back(arr[i]);
                i++;
            }
        }

        return res;
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
};