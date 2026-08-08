package Leetcode;

public class leetcode_33 {
    public int search(int[] arr, int target) {
        int pivot = pivot(arr);
        if (pivot == -1) {
            return bs(arr, 0, arr.length - 1, target);
        }
        if (target == pivot) {
            return pivot;
        } else if (target < arr[0]) {
            return bs(arr, pivot + 1, arr.length - 1, target);
        } else {
            return bs(arr, 0, pivot - 1, target);
        }

    }

    public int bs(int arr[], int start, int end, int target) {
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }

    public int pivot(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        int mid = start + (end - start) / 2;
        if (mid < end && arr[mid] > arr[mid + 1]) {
            return mid;
        } else if (mid > start && arr[mid - 1] > arr[mid]) {
            return mid - 1;
        } else if (arr[start] >= arr[mid]) {
            end = mid - 1;
        } else {
            start = mid + 1;
        }
        return -1;
    }
}
