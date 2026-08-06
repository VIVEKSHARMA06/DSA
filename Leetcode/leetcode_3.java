package Leetcode;

import java.util.HashSet;

public class leetcode_3 {
    public int lengthOfLongestSubstring(String s) {
        int i = 0;
        int j = 0;
        int max = Integer.MIN_VALUE;
        while (i < s.length()) {
            HashSet<Character> set = new HashSet<>();
            while (j < s.length()) {
                if (set.contains(s.charAt(j))) {
                    max = Math.max(max, j - i);
                    j = ++i;
                    break;
                } else {
                    set.add(s.charAt(j));
                    j++;
                }
            }
            if (j == s.length()) {
                return j - i;
            }
            max = Math.max(max, j - i);
        }
        return max;
    }
}
