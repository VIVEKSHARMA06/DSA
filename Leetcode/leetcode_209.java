package Leetcode;

public class leetcode_209 {
    public int minSubArrayLen(int target, int[] nums) {
        int ans = nums.length + 1;
        int i = 0;
        int j = 0;
        int sum = 0;
        while (i <= j) {
            if (sum < target) {
                if (j >= nums.length) {
                    break;
                }
                sum += nums[j];
                j++;
            } else {
                ans = Math.min(ans, j - i);
                sum -= nums[i];
                i++;
            }
        }
        if (ans == nums.length + 1) {
            return 0;
        }
        return ans;
    }
}
