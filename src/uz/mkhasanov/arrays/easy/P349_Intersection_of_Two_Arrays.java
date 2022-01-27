package uz.mkhasanov.arrays.easy;

import java.io.IOException;
import java.text.ParseException;
import java.util.*;
import java.util.stream.Collectors;

public class P349_Intersection_of_Two_Arrays {

    public static void main(String[] args) throws ParseException, IOException {

        System.out.println(Arrays.toString(intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4})));
    }


    public static int[] intersection(int[] nums1, int[] nums2) {
        List<Integer> resList = new ArrayList<>();
        int[] arr1, arr2;
        if (nums1.length <= nums2.length) {
            arr1 = nums1;
            arr2 = nums2;
        } else {
            arr1 = nums2;
            arr2 = nums1;
        }

        Arrays.sort(arr2);
        Set<Integer> set = new HashSet<>();
        for (int i : arr1) {
            set.add(i);
        }
        for (Integer val : set) {
            if (!resList.contains(val)) {
                int pos = binarySearch(arr2, 0, arr2.length - 1, val);
                if (pos != -1) {
                    resList.add(arr2[pos]);
                }
            }
        }
        int[] arr = new int[resList.size()];
        int i = 0;
        for (int e : resList) arr[i++] = e;
        return arr;

    }

    public static int binarySearch(int[] arr, int start, int end, int x) {
        if (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == x)
                return mid;
            if (arr[mid] > x)
                return binarySearch(arr, start, mid - 1, x);
            else
                return binarySearch(arr, mid + 1, end, x);
        }
        return -1;
    }

//    public static int[] intersection(int[] nums1, int[] nums2) {
//        Set<Integer> set1 = Arrays.stream(nums1).boxed().collect(Collectors.toSet());
//        Set<Integer> set2 = Arrays.stream(nums2).boxed().collect(Collectors.toSet());
//        set1.retainAll(set2);
//        return set1.stream().mapToInt(Number::intValue).toArray();
//    }


}
