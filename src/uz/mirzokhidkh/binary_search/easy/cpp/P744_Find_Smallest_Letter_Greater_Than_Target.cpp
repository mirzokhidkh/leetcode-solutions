class Solution {
public:
    char nextGreatestLetter(vector<char>& letters, char target) {
        return binarySearch(letters,target);
    }

    char binarySearch(vector<char>& arr, char target){
        char res = arr[0];

        int l = 0, r = arr.size()-1;

        while(l < r){

            int m = l + (r - l)/2;

            if(arr[m] > target){
                r = m;
            }else{
                l = m + 1;
            }
        }

        if(arr[l] > target){
            res = arr[l];
        }

        return res;
    }
};