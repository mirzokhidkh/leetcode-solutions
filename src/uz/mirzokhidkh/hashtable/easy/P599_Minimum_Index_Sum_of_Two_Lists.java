package uz.mirzokhidkh.hashtable.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class P599_Minimum_Index_Sum_of_Two_Lists {

    public String[] findRestaurant(String[] list1, String[] list2) {
        if(list1.length<list2.length){
            return findCommonInterest(list1,list2);
        }

        return findCommonInterest(list2,list1);
    }

    public String[] findCommonInterest(String[] list1, String[] list2){

        Map<Integer, List<String>> map = new HashMap<>();

        for (int i = 0; i < list1.length; i++) {
            for (int j = 0; j < list2.length; j++) {
                if (list1[i].equals(list2[j])) {
                    if (!map.containsKey(i + j)) {
                        map.put(i + j, new ArrayList<>());
                    }
                    map.get(i + j).add(list1[i]);
                }
            }
        }


        int minKey = Integer.MAX_VALUE;

        for (Integer key : map.keySet()) {
            minKey = Math.min(key, minKey);
        }

        String[] res = new String[map.get(minKey).size()];

        return map.get(minKey).toArray(res);
    }


}
