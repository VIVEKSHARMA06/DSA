package Recursion.String_Ques;

import java.util.ArrayList;

public class Leetcode_17 {
    public static void main(String[] args) {
        System.out.println(letterCombinations("5"));
    }

    public static ArrayList<String> letterCombinations(String digits) {
        if (digits.isEmpty()) return new ArrayList<>();

        String[] arr = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return ans("", digits, arr);
    }

    public static ArrayList<String> ans(String p, String up, String[] arr) {

        if (up.isEmpty()) {
            ArrayList<String> a = new ArrayList<>();
            a.add(p);
            return a;
        }

        ArrayList<String> list = new ArrayList<>();

        int digit = up.charAt(0) - '0';
        String letters = arr[digit - 2];   // ✅ correct mapping

        for (int i = 0; i < letters.length(); i++) {
            list.addAll(ans(p + letters.charAt(i),
                            up.substring(1),
                            arr));
        }

        return list;
    }
}
