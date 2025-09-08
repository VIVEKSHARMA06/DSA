package Sorting.Cyclic_Sort;

//leetcode 268
public class Leetcode_268 {
    static void swap(int[] arr, int a,int b) {
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }

    static int cyclic_sort (int[] arr) {
        int i=0;
        int ans=arr.length;
        while (i<arr.length) {
            if (arr[i]==i+1) {
                i++;
            }
            else {
                swap(arr,i,arr[i]);
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {5,4,6,2,1};
        System.out.println(cyclic_sort(arr));
    }
}
