class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {
         int l1 = nums1.size();
         int l2 = nums2.size();
         int total = l1 + l2;
         int half = total/2;

         if(l1 < l2){
             vector<int> temp = nums1;
             nums1 = nums2;
             nums2 = temp;
         }

         // [2,5,7,10,12,13,14]          total = 7 + 6 = 13
         // [1,3,4,9,16,20]              half  = 13/2  = 6
         int  B = nums2.size()/2;
         int  A = nums1.size()/2;

         while(true){





         }







       return (double)nums1[0];

    }


};