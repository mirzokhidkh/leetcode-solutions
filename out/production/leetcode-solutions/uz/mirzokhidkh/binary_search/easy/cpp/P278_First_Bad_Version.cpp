// The API isBadVersion is defined for you.
// bool isBadVersion(int version);

class Solution {
public:
    int firstBadVersion(int n) {
        return binarySearch(1,n);
    }

    int binarySearch(int l, int r){
        if(r == 1) return 1;

        int m = l + (r-l)/2;
        bool isBad = isBadVersion(m);
        bool isPrevBad = isBadVersion(m-1);

        if(isBad && !isPrevBad){
            return m;
        }else if(isBad){
            return binarySearch(1,m-1);
        }else{
            return binarySearch(m+1,r);
        }
    }
};