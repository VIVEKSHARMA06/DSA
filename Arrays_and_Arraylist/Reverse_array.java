package Arrays_and_Arraylist;
import java.util.*;
public class Reverse_array {
    static void swap(int arr[],int i,int j) {
        int temp = arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int i =0;
        int j=arr.length-1;
        while (i<j) {
            swap(arr,i,j);
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
