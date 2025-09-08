package Binary_search;

public class Floor_of_number {
// floor of a number is the greatest no. in array that is 
//less than or = the target element.
//after the loop stops running, the array is like [end, target, start] so the floor is arr[end] 

    static int bs(int arr[],int target) {
        int start = 0;
        int end = arr.length-1;
        while (start<=end) {
            int mid =start+ (end-start)/2;
            if (arr[mid]== target) {
                return mid;
            }
            if (arr[mid]>target) {
                    end=mid-1;
                }
            else {
                start=mid+1;
            }
        }
        return arr[end];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,63,87,98,432};
        System.out.println(bs(arr,43));
    }
}
