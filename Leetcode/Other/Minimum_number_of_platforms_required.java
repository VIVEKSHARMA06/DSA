package Leetcode.Other;

import java.util.Arrays;

public class Minimum_number_of_platforms_required {
    public int findPlatform(int[] Arrival, int[] Departure) {
        Arrays.sort(Arrival);
        Arrays.sort(Departure);

        int max = 0;
        int curr = 0;

        int i = 0, j = 0;

        while (i < Arrival.length) {
            if (Arrival[i] <= Departure[j]) {
                curr++;
                max = Math.max(max, curr);
                i++;
            } else {
                j++;
                curr--;
            }
        }

        return max;
    }
}
