package Binary_search;

public class Peak_in_mountain_array {

    static int ans(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) { // in the end only one element will remain in the array so, we ensure that it does not try to access the next element .
            int mid = start + (end - start) / 2;
            if (arr[mid] < arr[mid + 1]) {
                start = mid + 1; //we are in the ascending part so the peak is surely in the mid+1 to end array and not in mid.
            } else {
                end = mid; // but in descending part mid can also be peak [2,4,2,1], mid = 4, but if we set end=mid-1, our peak will be lost.
            }
        }
        return arr[start]; // peak
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,7,43,45,68,5,2};
        System.out.println(ans(arr));
    }
}
