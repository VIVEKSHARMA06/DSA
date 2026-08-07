package Leetcode;

public class leetcode_75 {
    // public void sortColors(int[] nums) {
    // int k = 0;
    // for (int i = 0; i < 3; i++) {
    // int j = k;
    // while (j < nums.length) {
    // if (i == nums[j]) {
    // int temp = nums[j];
    // nums[j] = nums[k];
    // nums[k] = temp;
    // k++;
    // }
    // j++;
    // }
    // }
    // }

    public void swap(int nums[], int i, int j) {
        int temp = nums[j];
        nums[j] = nums[i];
        nums[i] = temp;
    }

    public void sortColors(int[] nums) {
        int low = 0;
        int mid = 0;
        int high = nums.length - 1;
        while (mid <= high) {
            if (nums[mid] == 0) {
                swap(nums, mid, low);
                low++;
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums, mid, high);
                high--;
            } else {
                mid++;
            }
        }
    }

}
