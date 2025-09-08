package Arrays_and_Arraylist;
import java.util.*;
public class Basics {
    public static void main(String[] args) {
        // int[] arr1;                  //declaration of array at compile time
        // arr1 = new int[5];           //initialisation of array at run time

        //array is stored in the heap memory.
        //array is not always stored contiguously in the memory.
        //arrray internally contains many refrence variables for each memory block that points to different values inside the heap.

        // int[] arr2 = new int[5];            //fine
        // int arr3[] = new int[5];            //fine
        int[] arr4 = {1,2,3,4,5};           //fine
        String[] arr5 = new String[5];
        System.out.println(arr5[0]);        //null
        arr5[0]="a";
        System.out.println(arr5[0]);        //a

        //note
        //we can only assign null to a refrence variable but not as a literal.
        // int i = null;            wrong
        // String str2 = null;         //correct beacuse string is stored as an object

        //for each loop
        System.out.print("for each loop : ");
        for (int num : arr4) {
            System.out.print(num+" ");
        }
        System.out.println();
        
        System.out.println("Arrays.toString() : " + Arrays.toString(arr4));


        //2-D array

        // int[][] arr6 = new int[3][3];
        // int[][] arr7 = new int[3][];        //the size of inner arrays is not necessary it can be variable
        int[][] arr8 = {
            {1,2,3},
            {2,4},
            {1,5,6,7}
        };

        for (int[] arr : arr8) {
            System.out.println(Arrays.toString(arr));
        }

    }
}
