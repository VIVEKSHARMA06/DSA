package Leetcode;

import java.util.*;

public class leetcode_39 {
    class Solution {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        public void back(int[] candidates, int target, int sum, int index) {
            for (int i = index; i < candidates.length; i++) {
                int num = candidates[i];
                arr.add(num);
                if ((sum + num) == target) {
                    ans.add(new ArrayList<>(arr));
                    arr.remove(arr.size() - 1);
                    return;
                } else if ((sum + num) < target) {
                    back(candidates, target, sum + num, i);
                } else {
                    arr.remove(arr.size() - 1);
                    break;
                }
                if (arr.size() > 0) {
                    arr.remove(arr.size() - 1);
                }
            }
        }

        public List<List<Integer>> combinationSum(int[] candidates, int target) {
            Arrays.sort(candidates);
            back(candidates, target, 0, 0);
            return ans;
        }
    }
}
