package Leetcode.Other;

import java.util.HashMap;

public class longest_subarray_with_sum_K {
    public int longestSubarray(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);

        int prefix = 0;
        int max = 0;

        for (int i = 0; i < nums.length; i++) {

            prefix += nums[i];
            if (map.containsKey(prefix - k)) {
                max = Math.max(max, i-map.get(prefix - k));
            }
            if (!map.containsKey(prefix)) {
                map.put(prefix, i);
            }
        }

        return max;
    }
}
