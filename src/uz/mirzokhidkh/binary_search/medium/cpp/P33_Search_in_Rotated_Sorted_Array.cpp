class Solution {
public:
    int search(vector<int>& nums, int target) {
        int i = 0;
        for(i=1; i< nums.size(); i++){
            if(nums[i] < nums[i-1]){
                break;
            }
        }
        int v1 = binarySearch(nums,target,0,i-1);
        int v2 = binarySearch(nums,target,i,nums.size()-1);

        return v1 != -1 ? v1 : (v2 != -1 ? v2 : -1);
    }

    int binarySearch(vector<int>& nums, int x, int l, int r){
        if(l <= r){
            int m = l + (r-l)/2;
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



//class Solution {
//public:
//    int search(vector<int>& nums, int target) {
//        if(nums.size() == 1) return nums[0] == target ? 0 : -1;
//        bool isFoundPivotIndex = false;
//        int k = 0;
//        vector<int> sortedArr;
//        sortedArr.push_back(nums[0]);
//        for(int i=1; i< nums.size(); i++){
//            if(nums[i] < nums[i-1]){
//                isFoundPivotIndex = true;
//                k = i;
//            }
//            if(!isFoundPivotIndex){
//                sortedArr.push_back(nums[i]);
//            }else{
//                sortedArr.insert(sortedArr.begin() + i-k,nums[i]);
//            }
//        }
//        for (int i : sortedArr) {
//            cout << i << "-";
//        }
//        cout << "\n";
//        int b = binarySearch(sortedArr,target,0,sortedArr.size()-1);
//        cout << "===>> " << b;
//        return b != -1 ? ( b + k ) : -1;;
//    }
//
//
//    int binarySearch(vector<int>& nums, int x, int l, int r){
//        if(l <= r){
//            int m = l + (r-l)/2;
//            if(nums[m] == x){
//                return m;
//            }else if(nums[m] < x){
//                return binarySearch(nums,x,m+1,r);
//            }else{
//                return binarySearch(nums,x,l,m-1);
//            }
//        }
//        return -1;
//    }
//};