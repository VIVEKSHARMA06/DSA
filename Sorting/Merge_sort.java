    package Sorting;

    import java.util.Arrays;

    public class Merge_sort {
        // Merge sort is a divide and merge algorithm. It divides the array into two halves, calls itself for the two halves, and then merges the two sorted halves.
        // Time Complexity: O(n log n)
        // Space Complexity: O(n)

        public static void main(String[] args) {
            int[] arr = {2,5,3,1,6,4};
            sort(arr, 0, arr.length-1);
            System.out.println(Arrays.toString(arr));
        }

        static void sort(int[] arr, int low, int high ) {
            if (low>=high) {    //it means that when only 1 element is left, high and low will be equal.
                return;
            }

            int mid = low + (high-low)/2;

            sort(arr, low, mid);
            sort(arr, mid+1, high);

            merge(arr,low,mid,high);    //merge() will merge the two halves in a sorted manner.
        }

        static void merge(int[] arr, int low, int mid, int high) {
            int i=low,  //i is a pointer for the left half and j is a pointer for the right half.
            j=mid+1,    //k is a pointer for the mix array.
            k=0;

            int[] mix = new int[high-low+1];
            while (i<=mid && j<=high) { 
                //compare the elements of the two halves and add the smaller element to the mix array.
                if (arr[i]<=arr[j]) {
                    mix[k]=arr[i];
                    i++;
                }
                else {
                    mix[k]=arr[j];
                    j++;
                }
                k++;
            }

            while (i<=mid) {    //if any elements are left in the left half, add them to the mix array.
                mix[k]=arr[i];
                i++;
                k++;
            }

            while (j<=high) {   //if any elements are left in the right half, add them to the mix array.
                mix[k]=arr[j];
                j++;
                k++;
            }

            //copy the elements of the mix array to the original array.
            //we are copying to p+low index because mix array starts from 0 index but we have to copy it to the original array starting from low index.
            for (int p=0;p<=high-low;p++) { 
                arr[p+low]=mix[p];
            }
        }
    }
