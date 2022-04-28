package uz.mirzokhidkh.arrays.easy;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.*;

public class P594_Longest_Harmonious_Subsequence {
    public static void main(String[] args) {
//        System.out.println(findLHS(new int[]{1, 3, 2, 2, 5, 2, 3, 7}));
//        System.out.println(findLHS(new int[]{1, 2, 3, 4}));
//        System.out.println(findLHS(new int[]{1, 1, 1, 1}));
        System.out.println(findLHS(new int[]{1, 4, 1, 3, 1, -14, 1, -13}));
    }

    public static int findLHS(int[] nums) {
        int maxRes = 0;
        List<Integer> list = new ArrayList<>();
        boolean hasDifONe = false;

        for (int i = 0; i < nums.length; i++) {
            list.add(nums[i]);
            for (int j = 0; j < nums.length; j++) {
                boolean state = true;
                if ((abs(nums[i] - nums[j]) == 1 || abs(nums[i] - nums[j]) == 0) && i != j) {
                    for (Integer integer : list) {
                        if (abs(integer - nums[j]) == 1) {
                            hasDifONe = true;
                        }
                        if (abs(integer - nums[j]) > 1) {
                            state = false;
                            break;
                        }
                    }
                    if (state)
                        list.add(nums[j]);
                }
            }
//            System.out.println(hasDifONe);
//            System.out.println(list);
            if (hasDifONe)
                maxRes = max(maxRes, list.size());
            list.clear();
        }

        return maxRes;
    }

}
