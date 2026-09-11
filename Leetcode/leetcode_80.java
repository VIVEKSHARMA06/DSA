package Leetcode;

public class leetcode_80 {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 1;
        while (j < nums.length) {
            if (nums[i] == nums[j]) {
                if (i > 0 && nums[i - 1] == nums[j]) {
                    j++;
                } else {
                    i++;
                    swap(i, j, nums);
                    j++;
                }
            } else {
                i++;
                swap(i, j, nums);
                j++;
            }
        }
        return i + 1;
    }

    public void swap(int i, int j, int[] nums) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
