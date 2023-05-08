class Solution {
public:
    bool isPerfectSquare(int num) {
        return binarySearch(num);

    }

    bool binarySearch(int num){
        int l = 1, r = num;

        while(l <= r){
            int m = l + (r - l)/2;

            if(m == (double) num/m){
                return true;
            }else if(m < num/m){
                l = m+1;
            }else{
                r = m-1;
            }
        }

        return false;
    }
};