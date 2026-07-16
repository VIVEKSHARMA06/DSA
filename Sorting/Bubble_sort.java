package Sorting;
import java.util.Arrays; 
public class Bubble_sort {
    static void sort(int[] arr) {
        boolean swapped;        //this will check if in the iteration of 'i', there is any swap.
                                //if no, then further 'i' iteration will not run
        for (int i=0;i<arr.length-1;i++) {      //'i' loop will run from 0 to length-1 because the last element will be sorted itself. 
            swapped=false;      
            for (int j=1;j<arr.length-i;j++) {  //'j' will run from 1 to length-i-1 because after every iteration last element will be sorted, so we dont need to check for it.
                if (arr[j-1]>arr[j]) {
                    int temp=arr[j-1];
                    arr[j-1]=arr[j];
                    arr[j]=temp;
                    swapped=true;
                }
            }
            if (!swapped) {
                break;
            }
        }
    }
    
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
