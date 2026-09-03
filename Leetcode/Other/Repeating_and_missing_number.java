package Leetcode.Other;

public class Repeating_and_missing_number {
    class Solution {
        public int[] findMissingRepeatingNumbers(int[] nums) {
            int i = 0;
            while (i < nums.length) {
                if (nums[i] != nums[nums[i] - 1]) {
                    swap(i, nums[i] - 1, nums);
                } else {
                    i++;
                }
            }

            for (int j = 0; j < nums.length; j++) {
                if (nums[j] != j + 1) {
                    return (new int[] { nums[j], j + 1 });
                }
            }
            return new int[] {};
        }

        public void swap(int a, int b, int[] nums) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }
    }
}
