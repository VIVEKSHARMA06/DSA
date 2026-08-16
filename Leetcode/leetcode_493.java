package Leetcode;

public class leetcode_493 {
    // public int reversePairs(int[] nums) {
    // int count=0;
    // for (int i = 0; i < nums.length; i++) {
    // for (int j = i+1; j < nums.length; j++) {
    // if (nums[i]>2*nums[j]){
    // count++;
    // }
    // }
    // }

    // return count;
    // }

    
    // merge sort solution
    class Solution {
        public int reversePairs(int[] nums) {
            return mergeSort(nums, 0, nums.length - 1);
        }

        public int mergeSort(int[] nums, int start, int end) {
            if (start >= end) {
                return 0;
            }

            int mid = start + (end - start) / 2;

            int count = 0;

            count += mergeSort(nums, start, mid);
            count += mergeSort(nums, mid + 1, end);

            // Count reverse pairs across the two halves
            int j = mid + 1;

            for (int i = start; i <= mid; i++) {
                while (j <= end && (long) nums[i] > 2L * nums[j]) {
                    j++;
                }

                count += j - (mid + 1);
            }

            // Normal merge
            int[] temp = new int[end - start + 1];

            int i = start;
            j = mid + 1;
            int k = 0;

            while (i <= mid && j <= end) {
                if (nums[i] <= nums[j]) {
                    temp[k++] = nums[i++];
                } else {
                    temp[k++] = nums[j++];
                }
            }

            while (i <= mid) {
                temp[k++] = nums[i++];
            }

            while (j <= end) {
                temp[k++] = nums[j++];
            }

            for (i = start; i <= end; i++) {
                nums[i] = temp[i - start];
            }

            return count;
        }
    }

}