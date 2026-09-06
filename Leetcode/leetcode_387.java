package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class leetcode_387 {
    public int firstUniqChar(String s) {
        int n = 1;
        char ans = ' ';
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                map.put(s.charAt(i), -1);
            } else {
                map.put(s.charAt(i), n);
                n++;
            }
        }
        n = s.length();
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() != -1 && n > entry.getValue()) {
                ans = entry.getKey();
                n = entry.getValue();
            }
        }
        return s.indexOf(ans);
    }

    // gpt
    class Solution {
        public int firstUniqChar(String s) {
            int[] freq = new int[26];

            // Count frequency
            for (char c : s.toCharArray()) {
                freq[c - 'a']++;
            }

            // Find first character with frequency 1
            for (int i = 0; i < s.length(); i++) {
                if (freq[s.charAt(i) - 'a'] == 1) {
                    return i;
                }
            }

            return -1;
        }
    }
}
