package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_40 {
    List<List<Integer>> ans = new ArrayList<>();
    List<Integer> arr = new ArrayList<>();

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        back(0, 0, target, candidates);
        return ans;
    }

    public void back(int i, int sum, int target, int[] candidates) {
        for (int j = i; j < candidates.length; j++) {
            if (j > i && candidates[j] == candidates[j - 1])
                continue;
            sum += candidates[j];
            if (sum == target) {
                arr.add(candidates[j]);
                ans.add(new ArrayList<>(arr));
                arr.remove(arr.size() - 1);
                return;
            } else if (sum > target) {
                return;
            } else {
                arr.add(candidates[j]);
                back(j + 1, sum, target, candidates);
                arr.remove(arr.size() - 1);
            }
            sum-=candidates[i];
        }
    }
}
