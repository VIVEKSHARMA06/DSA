package Sorting;

import java.util.Arrays;

public class Insertion_sort {
    //we start from index 1, if the number is greater than its pevious then swap
    //if doesnt swap then break because the left side will already be sorted.
    //do this for n-2 times because we need only 4 n-1 iterations to sort the array.
    //each time the number is being inserted into the correct position.

    static void swap(int[] arr, int a,int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static void sort(int[] arr) {
        for (int i=0;i<arr.length-1;i++) {
            for (int j=i+1;j>0;j--) {
                if (arr[j-1]>arr[j]) {
                    swap(arr,j,j-1);
                }
                else {
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1,-3};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
