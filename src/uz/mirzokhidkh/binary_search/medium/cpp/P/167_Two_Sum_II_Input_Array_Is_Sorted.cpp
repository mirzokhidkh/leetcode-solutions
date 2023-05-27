class Solution {
public:
    vector<int> twoSum(vector<int>& arr, int x) {

        // cout <<"ind = "<< ind;
        int l = 0 ;
        int r = binarySearch(arr,x);


        while(l < r){
            int sum =  arr[l] + arr[r];
            if(sum == x){
                return {l+1,r+1};
            }else if(sum < x){
                l++;
            }else{
                r--;
            }
        }
        return {};
    }


    int binarySearch(vector<int>& arr, int x){
        int l = 0, r = arr.size()-1;
        int  i = 0;
        while(l <= r){
            int m = l + (r - l)/2;

            if(m+1 < arr.size() && arr[m] < x  && arr[m+1] > x){
                i = m;
                break;
            }else if(arr[m] < x){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }

        return (i > 0 && i < arr.size() && arr[i] >= 0) ? i : arr.size()-1;
    }






};