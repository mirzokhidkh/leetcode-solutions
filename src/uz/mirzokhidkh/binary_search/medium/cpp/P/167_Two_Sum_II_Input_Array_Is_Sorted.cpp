class Solution {
public:
    vector<int> twoSum(vector<int>& arr, int x) {

        int ind = binarySearch(arr,x);
        // if(ind == 0){
        //     return {ind+1,binarySearch(arr,x-arr[ind])+1};
        // }
        cout <<"ind = "<< ind;
        int l = 0 ;
        // int r = ind;
        int r = ind < arr.size() ? ind : arr.size()-1;

        if(arr[r] == x && arr[r] < 0){
            return {r+1,r+2};
        }

        while(l < r){
            int sum =  arr[l] + arr[r];
            if(sum == x){
                return {l+1,r+1};
                // break;
            }else if(sum < x){
                l++;
            }else{
                r--;
            }
        }
        return {-1,-1};
    }


    int binarySearch(vector<int>& arr, int x){
        int l = 0, r = arr.size()-1;

        while(l <= r){
            int m = l + (r - l)/2;

            if(m+1 < arr.size() && arr[m] <= x  && arr[m+1] > x){
                return m;
            }else if(arr[m] < x){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }

        return l;
    }


};