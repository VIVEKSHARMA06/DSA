package Leetcode;

import java.util.ArrayList;
// import java.util.Arrays;
import java.util.List;

public class leetcode_46 {
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        public List<List<Integer>> permute(int[] nums) {
            ArrayList<Integer> ns = new ArrayList<>();

            for (int num : nums) {
                ns.add(num);
            }
            back(0, ns);
            return ans;
        }

        public void back(int j, ArrayList<Integer> ns) {
            if (ns.size() == 0) {
                ans.add(new ArrayList<>(arr));
                return;
            }
            for (int i = 0; i < ns.size(); i++) {
                int curr = ns.remove(i);
                arr.add(curr);
                back(j + 1, ns);
                arr.remove(arr.size() - 1);
                ns.add(i, curr);
            }
        }
    }
}
