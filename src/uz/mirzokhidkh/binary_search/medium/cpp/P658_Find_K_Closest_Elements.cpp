class Solution {
public:
    vector<int> findClosestElements(vector<int>& nums, int k, int x) {
        int n = nums.size()-1;
        vector<int> res;
        int ind = binarySearch(nums,x);
        int l = ind-1, r= ind+1;
        res.push_back(nums[ind]);
        while(k > 1 && l >= 0 && r <= n){
            if(abs(nums[l]-x) <= abs(nums[r]-x)){
                res.insert(res.begin()+0, nums[l]);
                l--;
            }else{
                res.push_back(nums[r]);
                r++;
            }
            k--;
        }

        while(k > 1){
            if(l < 0){
                res.push_back(nums[r]);
                r++;
            }else{
                res.insert(res.begin()+0, nums[l]);
                l--;
            }
            k--;
        }
        return res;
    }


  int binarySearch(vector<int>& nums, int x){
        int l = 0, r = nums.size()-1;

        while(l+1 < r){
            int m = l + (r - l)/2;

            if(nums[m] == x){
                return m;
            }else if(nums[m] < x){
                l = m;
            }else{
                r = m;
            }
        }

        // cout << "nums[l] = "<<nums[l]<<endl;
        // cout << "nums[r] = "<<nums[r]<<endl;
        if(abs(nums[l]-x) <= abs(nums[r]-x)){
            return l;
        }
        return r;
    }
};