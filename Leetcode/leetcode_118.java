package Leetcode;

import java.util.ArrayList;
import java.util.List;

// import Arrays_and_Arraylist.Arraylist;

public class leetcode_118 {
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> list = new ArrayList<>();
        for(int i=0; i<numRows; i++) {
            ArrayList<Integer> arr  = new ArrayList<>();
            for(int j=0; j<=i; j++) {
                if (j==0 || j==i) {
                    arr.add(1);
                }
                else {
                    arr.add(list.get(i-1).get(j-1)+list.get(i-1).get(j));
                }
            }
            list.add(arr);

        }
        return list;
    }

    public static void main(String[] args) {
        System.out.println(generate(5));
    }
}
