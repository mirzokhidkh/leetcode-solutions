package uz.mirzokhidkh.hashtable.easy;

import java.util.*;

public class P771_Jewels_and_Stones {


    public int numJewelsInStones(String jewels, String stones) {

        Set<Character> set = new HashSet<>();

        for(Character c : jewels.toCharArray()){
            set.add(c);
        }

        int count = 0;

        for(Character c : stones.toCharArray()){
            if(set.contains(c)){
                count++;
            }
        }

        return count;

    }


}
