package uz.mirzokhidkh.hashtable.medium;

import java.util.*;

public class P454_4Sum_II {

    public int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4) {

        Map<Integer, Integer> pairSumCount = new HashMap<>();

        for(int i : nums1){
            for(int j : nums2){
                pairSumCount.compute(i+j,(k,sumCount)->sumCount==null ? 1:++sumCount);
            }
        }

        int fourSumCount = 0;


        for(int i : nums3){
            for(int j : nums4){
                fourSumCount += pairSumCount.getOrDefault(-(i+j),0);
            }
        }

        return fourSumCount;
    }

}
