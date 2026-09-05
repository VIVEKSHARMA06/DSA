package Leetcode;

public class leetcode_268 {
    class Solution {
        void swap(int[] nums, int a, int b) {
            int temp = nums[a];
            nums[a] = nums[b];
            nums[b] = temp;
        }

        int cyclic_sort(int[] nums) {
            int i = 0;
            int ans = nums.length;
            while (i < nums.length) {
                if (nums[i] == i) {
                    i++;
                } else if (nums[i] == nums.length) {
                    ans = i;
                    i++;
                } else {
                    swap(nums, i, nums[i]);
                }
            }
            return ans;
        }

        public int missingNumber(int[] nums) {
            return cyclic_sort(nums);
        }
    }
}
