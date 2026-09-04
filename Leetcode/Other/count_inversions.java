package Leetcode.Other;

public class count_inversions {
    long count = 0;

    public long numberOfInversions(int[] nums) {
        sort(nums, 0, nums.length - 1);
        return count;
    }

    public void sort(int[] nums, int start, int end) {
        if (start >= end)
            return;
        int mid = start + (end - start) / 2;
        sort(nums, start, mid);
        sort(nums, mid + 1, end);
        merge(nums, start, mid, end);
    }

    public void merge(int[] nums, int start, int mid, int end) {
        int[] temp = new int[end - start + 1];
        int i = start;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= end) {
            if (nums[i] <= nums[j]) {
                temp[k] = nums[i];
                i++;
            } else {
                count += mid - i + 1;
                temp[k] = nums[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = nums[i];
            i++;
            k++;
        }

        while (j <= end) {
            temp[k] = nums[j];
            j++;
            k++;
        }
        for (int k2 = 0; k2 <= end - start; k2++) {
            nums[k2 + start] = temp[k2];
        }
    }

}
