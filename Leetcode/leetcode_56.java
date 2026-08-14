package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class leetcode_56 {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int[] arr = { intervals[0][0], intervals[0][1] };
        ans.add(new int[] { arr[0], arr[1] });

        int i = 1;
        while (i < intervals.length) {
            arr[0] = intervals[i][0];
            arr[1] = intervals[i][1];

            if (ans.get(ans.size()- 1)[0] <= arr[0] && ans.get(ans.size() - 1)[1] >= arr[0]) {
                ans.set(ans.size() - 1,
                        new int[] { ans.get(ans.size() - 1)[0], Math.max(arr[1], ans.get(ans.size() - 1)[1]) });
            } else {
                ans.add(new int[] { arr[0], arr[1] });
            }
            i++;
        }

        return ans.toArray(new int[ans.size()][]);
    }
}
