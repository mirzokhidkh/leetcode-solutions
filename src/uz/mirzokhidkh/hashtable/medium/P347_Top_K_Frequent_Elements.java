package uz.mirzokhidkh.hashtable.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P347_Top_K_Frequent_Elements {

    public int[] topKFrequent(int[] nums, int k) {

        Map<Integer, Integer> map = new HashMap<>();

        for (int i : nums) {
            map.compute(i, (key, val) -> val == null ? 1 : ++val);
        }


        List<Integer>[] list = new List[nums.length + 1];

        for (Integer key : map.keySet()) {

            int freq = map.get(key);
            if (list[freq] == null) {
                list[freq] = new ArrayList<>();
            }
            list[freq].add(key);

        }


        int j = 0;
        int[] res = new int[k];

        for (int i = list.length - 1; i >= 0 && k > 0; i--) {
            if (list[i] != null) {
                for (Integer num : list[i]) {
                    res[j++] = num;
                    k--;
                }
            }
        }


        return res;
    }

}
