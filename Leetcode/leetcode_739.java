package Leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
// import java.util.Stack;

public class leetcode_739 {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] ans = new int[temperatures.length];
        Deque<Integer> stk = new ArrayDeque<>();
        for (int i = 0; i < ans.length; i++) {
            while (!stk.isEmpty() && temperatures[stk.peek()] < temperatures[i]) {
                int pop = stk.pop();
                ans[pop] = i - pop;
            }
            stk.push(i);
        }
        return ans;
    }
}
