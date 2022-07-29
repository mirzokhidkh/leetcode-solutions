package uz.mirzokhidkh.hashtable.easy;

import java.util.HashSet;
import java.util.Set;

public class P217_Contains_Duplicate {

    //APPROACH-1
    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int i : nums) {
            if (set.contains(i))
                return true;

            set.add(i);
        }


        return false;
    }


}
