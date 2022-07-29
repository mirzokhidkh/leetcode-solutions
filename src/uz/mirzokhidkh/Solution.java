package uz.mirzokhidkh;

import java.util.*;

public class Solution {

    public static void main(String[] args) {

        Set<Integer> set1=new HashSet<>(),set2=new HashSet<>();

        int[] nums1 = new int[]{4,9,5};
        int[] nums2 = new int[]{9,4,9,8,4};

        for (int i: nums1) {
            set1.add(i);
        }
        for (int i: nums2) {
            set2.add(i);
        }


        int[] arr1 = new int[set1.size()];
        int j = 0;
        for (int i: set1) {
            arr1[j++] = i;
        }


        int[] arr2 = new int[set2.size()];
        j = 0;
        for (Integer i: set2) {
            arr2[j++] = i;
        }


        Arrays.sort(arr2);

        Set<Integer> set = new HashSet<>();


        for(int i : arr1){
            if(binarySearch(arr2,0,arr2.length-1,i) != -1){
                set.add(i);
            }
        }

        int[] res = new int[set.size()];
        j=0;
        for(int i:set){
            res[j++]=i;
        }

        System.out.println(Arrays.toString(res));

    }

    public static int binarySearch(int[] arr,int l,int r,int x){
//        if (l <= r) {
//            int mid = r - (r - l) / 2;
//
//            if (arr[mid] == x) {
//                return mid;
//            } else if (arr[mid] < x) {
//                return binarySearch(arr, l, mid-1, x);
//            } else {
//                return binarySearch(arr, mid + 1, r, x);
//            }
//        }
//
//        return -1;

        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the
            // middle itself
            if (arr[mid] == x)
                return mid;

            // If element is smaller than mid, then
            // it can only be present in left subarray
            if (arr[mid] > x)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present
            // in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present
        // in array
        return -1;
    }

}
