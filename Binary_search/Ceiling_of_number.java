package Binary_search;
public class Ceiling_of_number {
// ceiling of a number is the samllest no. in array that is 
//greater than or = the target element.
//after the loop stops running, the array is like [end, target, start] so the cieling is arr[start] 
    static int bs(int arr[],int target) {
        int start = 0;
        int end = arr.length-1;
        if (arr[end]<target) {
            return -1;          //if targt is greater than the greatest element in the array then there is no cieling of the target.
        }
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
        return arr[start];
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,63,87,98,432};
        System.out.println(bs(arr,43));
    }
}