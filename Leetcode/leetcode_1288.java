package Leetcode;

import java.util.Arrays;

public class leetcode_1288 {
    // mine
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        int i = 0;
        int j = 1;
        int count = intervals.length;
        while (i < intervals.length) {
            if (intervals[i][0] == intervals[j][0]) {
                if (intervals[i][1] <= intervals[j][1]) {
                    i = j;
                    j++;
                } else {
                    j++;
                }
                count--;
            } else if (intervals[i][1] >= intervals[j][1]) {
                j++;
                count--;
            } else {
                i = j;
                j++;
            }
        }
        return count;
    }

    // chatgpt
    class Solution {
        public int removeCoveredIntervals(int[][] intervals) {

            Arrays.sort(intervals, (a, b) -> {
                if (a[0] != b[0])
                    return Integer.compare(a[0], b[0]);

                return Integer.compare(b[1], a[1]);
            });

            int count = 0;
            int maxEnd = 0;

            for (int[] interval : intervals) {

                if (interval[1] > maxEnd) {
                    count++;
                    maxEnd = interval[1];
                }
            }

            return count;
        }
    }
}
