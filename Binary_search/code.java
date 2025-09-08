package Binary_search;
// import java.util.*;
class code {
    
    static int bs(int arr[],int target) {
        int start = 0;
        int end = arr.length-1;
        boolean isAsc = true;
        if (arr[start]>arr[end]) {
            isAsc= false;
        }
        while (start<=end) {
            int mid =start+ (end-start)/2;
            if (arr[mid]== target) {
                return mid;
            }
            else if(isAsc){
                if (arr[mid]>target) {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
            else {
                if (arr[mid]<target) {
                    end=mid-1;
                }
                else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,7,63,87,98,432};
        System.out.println(bs(arr,43));
    }
}