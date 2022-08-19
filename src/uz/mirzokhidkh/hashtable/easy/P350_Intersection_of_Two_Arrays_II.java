package uz.mirzokhidkh.hashtable.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class P350_Intersection_of_Two_Arrays_II {
    
    public static void main(String[] args) {
//        System.out.println(Arrays.toString(intersect(new int[]{1, 2, 2, 1}, new int[]{2, 2})));
    }

    public int[] intersect(int[] nums1, int[] nums2) {

        Arrays.sort(nums1);
        Arrays.sort(nums2);

        Map<Integer, Integer> hm = new HashMap<>();

        int cur = nums1[0];
        int count = 1;

        for (int i = 1; i < nums1.length; i++) {

            if (cur == nums1[i]) {
                count++;
            }

            if (cur != nums1[i]) {

                int k = binarySearch(nums2, 0, nums2.length - 1, cur, count);

                if (k != -1) {
                    hm.put(cur, k);
                }

                cur = nums1[i];
                count = 1;
            }

        }


        int k = binarySearch(nums2, 0, nums2.length - 1, cur, count);

        if (k != -1) {
            hm.put(cur, k);
        }


        int size = 0;

        for (Integer s : hm.values()) {
            size += s;
        }


        int[] res = new int[size];


        int j = 0;
        for (Integer num : hm.keySet()) {
            for (int i = 0; i < hm.get(num); i++) {
                res[j] = num;
                j++;
            }
        }

        return res;

    }

    public int binarySearch(int[] arr, int l, int r, int x, int count) {
        if (l <= r) {

            int mid = l + (r - l) / 2;

            if (arr[mid] == x) {
                int k = 1;
                int left = mid - 1;
                int right = mid + 1;

                while (left >= 0 || right < arr.length) {

                    if (left >= 0 && arr[left] == x) {
                        k++;
                    }

                    if (right < arr.length && arr[right] == x) {
                        k++;
                    }


                    if((left >= 0 && arr[left] != x && right>=arr.length) ||
                            (right < arr.length && arr[right] != x && left<0) ||
                            (left >=0 && right <=arr.length && arr[left] != x && arr[right] != x)
                    ){
                        break;
                    }

                    left--;
                    right++;

                }


                return Math.min(k, count);
            }

            if (arr[mid] > x) {
                return binarySearch(arr, l, mid - 1, x, count);
            }
            return binarySearch(arr, mid + 1, r, x, count);
        }

        return -1;
    }

}
