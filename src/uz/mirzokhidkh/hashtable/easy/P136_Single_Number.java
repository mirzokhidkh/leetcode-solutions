package uz.mirzokhidkh.hashtable.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class P136_Single_Number {

    //APPROACH-1
    public int singleNumber(int[] nums) {



        Map<Integer,Integer> map = new HashMap<>();

        for (int i : nums) {

            map.put(i,map.getOrDefault(i,0)+1);

        }

        for(int i : map.keySet()){
            if(map.get(i) == 1){
                return i;
            }
        }

        return -1;
    }


}
