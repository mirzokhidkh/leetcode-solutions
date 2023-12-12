class Solution {
public:
    vector<int> intersection(vector<int>& nums1, vector<int>& nums2) {

        int s1 = nums1.size();
        int s2 = nums2.size();

        if(s1 > s2){
            sort(nums1.begin(), nums1.end());
            return helper(nums2, nums1);
        }else{
            sort(nums2.begin(), nums2.end());
            return helper(nums1, nums2);
        }
    }

    vector<int> helper(vector<int>& v1, vector<int>& v2){
        vector<int> res;
        for(int val : v1){
            if(find(res.begin(),res.end(),val)== res.end() && binarySearch(v2,val) != -1){
                    res.push_back(val);
            }
        }
        return res;
    }

    int binarySearch(vector<int>& arr, int x){
        if (arr.size() == 0){
            return -1;
        }
        int l = 0, r = arr.size() - 1;
        while(l <= r){
            int m = l + (r - l) / 2;
            if(arr[m] == x){
                return m;
            }else if(arr[m] < x){
                l = m + 1;
            }else{
                r = m - 1;
            }
        }
        return -1;
    }


};