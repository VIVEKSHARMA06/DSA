package Leetcode;

import java.util.Arrays;

public class leetcode_435 {
    class Solution {
        public int eraseOverlapIntervals(int[][] intervals) {
            int count = 0;
            Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
            int i = 0;
            int j = 1;
            while (j < intervals.length) {
                if (intervals[i][1] > intervals[j][0]) {
                    if (intervals[i][1] < intervals[j][1]) {
                    } else {
                        i = j;
                    }
                    count++;
                } else {
                    i = j;
                }
                j++;
            }
            return count;
        }
    }
}
