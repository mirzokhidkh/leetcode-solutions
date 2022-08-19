package uz.mirzokhidkh.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

public class P219_Contains_Duplicate_II {

    //APPROACH-1
    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> hm = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            if (hm.containsKey(nums[i]) && i - hm.get(nums[i]) <= k) {
                return true;
            }

            hm.put(nums[i], i);
        }

        return false;
    }


    //APPROACH-2
    public boolean containsNearbyDuplicate2(int[] nums, int k) {


        for (int i = 0; i < nums.length; i++) {

            int r = i + k;

            if (r >= nums.length) {
                r = nums.length - 1;
            }

            while (i != r && r < nums.length) {
                if (nums[i] == nums[r]) {
                    return true;
                }
                r--;
            }

        }

        return false;
    }


}
