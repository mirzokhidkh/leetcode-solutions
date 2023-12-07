class Solution {
public:
    vector<int> intersect(vector<int>& nums1, vector<int>& nums2) {

        int l1 = nums1.size();
        int l2 = nums2.size();
        sort(nums1.begin(), nums1.end());
        sort(nums2.begin(), nums2.end());

        if(l1 < l2){
            return helper(nums1,nums2);
        }else{
            return helper(nums2,nums1);
        }
    }

    vector<int> helper(vector<int>& v1, vector<int>& v2){
        vector<int> res;

        for(int i = 0; i < v1.size(); i++){
            int val = v1[i];
            int c1 = countTarget(v1,i);
            int c2 = binarySearch(v2,val);

            if(c2 != -1 && find(res.begin(),res.end(),val)== res.end()){
                int minCount = min(c1,c2);
                while(minCount -- > 0){
                    res.push_back(val);
                }
            }

        }

        return res;
    }

    int countTarget(vector<int> & arr, int i){
        int l = i-1, r = i+1;
        while(l >= 0 && arr[l] == arr[i] ){
            l--;
        }
        while(r < arr.size() && arr[r] == arr[i] ){
            r++;
        }
        return r-l-1;
    }

    int binarySearch(vector<int>& arr, int x){
        if(arr.size() == 0) return -1;

        int l = 0, r = arr.size()-1;

        while(l <= r){
            int m = l + (r - l)/2;
            if(arr[m] == x){
                return countTarget(arr,m);
            }else if(arr[m] < x){
                 l = m + 1;
            }else{
                 r = m - 1;
            }
        }
        return -1;
    }
};