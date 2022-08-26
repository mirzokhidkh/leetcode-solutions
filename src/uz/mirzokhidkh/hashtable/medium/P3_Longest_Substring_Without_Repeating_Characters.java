package uz.mirzokhidkh.hashtable.medium;

import java.util.HashSet;
import java.util.Set;

public class P3_Longest_Substring_Without_Repeating_Characters {

    public int lengthOfLongestSubstring(String s) {

        int l = 0;
        StringBuilder sub = new StringBuilder();

        // for(Character c : s.toCharArray()){
        for (int i = 0, j = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            if (!sub.toString().contains(String.valueOf(c))) {
                sub.append(c);
            } else {
                l = Math.max(l, sub.length());
                sub = new StringBuilder();
                i = j;
                j++;
            }
        }

        l = Math.max(l, sub.length());

        return l;

    }


    //APPROACH-2 SLIDING WINDOW
    public int lengthOfLongestSubstring2(String s) {

        int max = 0;
        Set<Character> set = new HashSet<>();

        int j = 0;

        for (int i = 0; i < s.length(); i++) {
            Character c = s.charAt(i);

            while (set.contains(c)) {
                set.remove(s.charAt(j));
                j++;
            }
            set.add(c);
            max = Math.max(max, i - j + 1);

        }


        return max;

    }
}
