package Leetcode;

import java.util.*;

public class leetcode_424 {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int ans = 0;
        int i = 0;
        int j = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        while (j < s.length() && i <= j) {
            if (j - i - max < k) {
                map.put(s.charAt(j), map.getOrDefault(s.charAt(j), 0) + 1);
                for (HashMap.Entry<Character, Integer> entry : map.entrySet()) {
                    if (entry.getValue() > max) {
                        max = entry.getValue();
                    }
                }
                j++;
            } else {
                map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) - 1);
                i++;
            }
        }
        return max;
    }
}
