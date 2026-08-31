package Leetcode;

public class leetcode_55 {
    public boolean canJump(int[] nums) {
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) {
            max--;
            if (max <= 0 && nums[i] == 0)
                return false;
            max = Math.max(max, nums[i]);
        }
        return true;
    }
}
