package Leetcode;

import java.util.HashMap;

public class leetcode_621 {
    class Solution {
        public int leastInterval(char[] tasks, int n) {

            HashMap<Character, Integer> map = new HashMap<>();

            for (char task : tasks) {
                map.put(task, map.getOrDefault(task, 0) + 1);
            }

            int maxFreq = 0;
            int maxCount = 0;

            for (int freq : map.values()) {
                if (freq > maxFreq) {
                    maxFreq = freq;
                    maxCount = 1;
                } else if (freq == maxFreq) {
                    maxCount++;
                }
            }

            int result = (maxFreq - 1) * (n + 1) + maxCount;

            return Math.max(result, tasks.length);
        }
    }
}
