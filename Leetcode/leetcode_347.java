package Leetcode;

import java.util.Arrays;

public class leetcode_347 {
    public int[] topKFrequent(int[] nums, int k) {
        if (nums.length == k) {
            return nums;
        }
        int[] ans = new int[k];
        int[] freq = new int[k];
        Arrays.sort(nums);
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (i == nums.length - 1) {
                int min = 0;
                for (int j = 1; j < freq.length; j++) {
                    if (freq[j] < freq[min]) {
                        min = j;
                    }
                }
                if (freq[min] <= count) {
                    freq[min] = count;
                    ans[min] = nums[i - 1];
                }
            } else if (nums[i] == nums[i - 1]) {
                count++;
            } else {
                int min = 0;
                for (int j = 1; j < freq.length; j++) {
                    if (freq[j] < freq[min]) {
                        min = j;
                    }
                }
                if (freq[min] <= count) {
                    freq[min] = count;
                    ans[min] = nums[i - 1];
                    count = 1;
                }
            }
        }
        return ans;
    }
}
