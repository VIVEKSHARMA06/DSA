package Binary_search;

public class Search_infinite_array {

    // we keep doubling the array until we find the range where the number can be found.
    //then apply binary search in that range.
    static int ans (int[] arr,int target) {
        int s = 0;
        int e = 1;
        while (arr[e]<target) {
            int temp = e;               
            e = e + (e-s+1)*2;          //(e-s+1)*2 is the size of the new range to be searched.
            s= temp+1;
        }
        return bs(arr, s, e, target);
    }

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

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 5, 7, 8, 72, 79, 98, 99, 102, 923,9243,99933};
        int target = 98;
        System.out.println(ans(arr, target));
    }
}
