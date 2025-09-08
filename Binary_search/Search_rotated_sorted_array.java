package Binary_search;

public class Search_rotated_sorted_array {

    static int bs(int arr[], int start, int end, int target) {
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

    static int pivot(int[] arr) {
        int start = 0, end = arr.length-1;
        while (start<=end) {
            int mid = start + (end-start)/2;
            if (mid<end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            else if (mid>start && arr[mid-1]>arr[mid]) {
                return mid-1;
            }
            else if (arr[start]>=arr[mid]) {
                end=mid-1;
            }
            else {
                start = mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {5};
        int target = 1;
        int pivot = pivot(arr);
        if (pivot==-1) {
            System.out.println(bs(arr,0,arr.length-1,target));
        }
        else if (target==arr[pivot]) {
            System.out.println(pivot);
        }
        else if(target<arr[0]) {
            System.out.println(bs(arr, pivot+1, arr.length-1, target));
        }
        else {
            System.out.println(bs(arr, 0, pivot-1, target));
        }
    }
}
