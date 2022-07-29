package uz.mirzokhidkh.hashtable.easy;

import java.util.HashMap;
import java.util.Map;

public class P1_Two_Sum {

    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> map = new HashMap<>();
        int[] res = new int[2];

        for(int i=0;i<nums.length;i++){

            int firstKey = target - nums[i];

            if(map.containsKey(firstKey)){
                res =  new int[]{map.get(firstKey),i};
                break;
            }

            map.put(nums[i],i);
        }

        return res;

    }


}
