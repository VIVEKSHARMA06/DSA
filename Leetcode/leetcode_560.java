package Leetcode;

import java.util.HashMap;

public class leetcode_560 {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int count = 0;
        map.put(0, 1);
        int prefix = 0;
        for (int i = 0; i < nums.length; i++) {
            prefix += nums[i];
            count += map.getOrDefault(prefix - k, 0);
            map.put(prefix, map.getOrDefault(prefix, 0) + 1);
        }
        return count;
    }
}
