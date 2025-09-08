package Binary_search;

public class Rotation_count_rotated_sorted_array {

    //we apply the approach in which we find pivot ..so the times in which array is rotated is pivot+1.
    //[4,5,6,7,1,2,3] , in this pivot is at 3 index. array is rotated for 4 times.

    static int pivot (int[] arr) {
        int start=0, end = arr.length-1;
        while (start<= end) {
            int mid = start + (end-start)/2;
            if (mid < end && arr[mid]>arr[mid+1]) {
                return mid;
            }
            else if (mid > start && arr[mid-1]>arr[mid]) {
                return mid-1;
            }
            else if (arr[start]>=arr[mid]) {
                end = mid-1;
            }
            else {
                start=mid+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,1,2,3};
        System.out.println("Array is rotated for "+(pivot(arr)+1) +" times");
    }
}
