class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
         int m = nums1.size(), n = nums2.size();
         int total = m + n;
         int half = total/2;

         if(m > n){
            return findMedianSortedArrays(nums2,nums1);
         }

         // [1,3,4,9,16,20]              total = 7 + 6 = 13
         // [2,5,7,10,12,13,14]          half  = 13/2  = 6
         int l = 0, r = m;

         while(l <= r){
             int i = (l + r)/2;
             int j = half - i;

             int Aleft  = i > 0 ? nums1[i-1] : INT_MIN;
             int Aright = i < m ? nums1[i] : INT_MAX;
             int Bleft  = j > 0 ? nums2[j-1] : INT_MIN;
             int Bright = j < n ? nums2[j] : INT_MAX;

             if(Aleft <= Bright && Bleft <= Aright){
                 if(total % 2 == 0){
                     return (max(Aleft,Bleft) + min(Aright,Bright)) / 2.0;
                 }else{
                     return min(Aright,Bright);
                 }
             }else if(Aleft > Bright){
                 r = i - 1;
             }else{
                 l = i + 1;
             }
         }

       return -1;
    }

};