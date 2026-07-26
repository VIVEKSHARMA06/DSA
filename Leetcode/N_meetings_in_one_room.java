package Leetcode;

import java.util.Arrays;

public class N_meetings_in_one_room {
    public int maxMeetings(int[] start, int[] end) {

        int arr[][] = new int[start.length][2];

        for (int i=0;i<start.length;i++) {
            arr[i]= new int[]{start[i],end[i]};
        }

        Arrays.sort(arr,(a,b) -> Integer.compare(a[1],b[1]));

        int count=1;
        int curr= 0;
        for (int i=1;i<start.length;i++) {
            if(arr[i][0]>arr[curr][1]) {
                count++;
                curr=i;
            }
        }
        return count;
    }
}
