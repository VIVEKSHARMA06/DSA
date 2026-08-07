package Leetcode;

public class leetcode_31 {
    public void nextPermutation(int[] nums) {
        int i = nums.length - 2;
        int j = i + 1;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        if (i == -1) {
            reverse(nums, 0, nums.length - 1);
        } else {
            while (nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j);
            reverse(nums, i + 1, nums.length - 1);
        }
    }

    public void swap(int nums[], int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public void reverse(int[] nums, int i, int j) {
        while (i < j) {
            swap(nums, i, j);
            i++;
            j--;
        }
    }
}
