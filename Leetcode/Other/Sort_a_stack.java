package Leetcode.Other;

import java.util.*;

public class Sort_a_stack {
    public void sortStack(Stack<Integer> st) {
        if (st.isEmpty()) {
            return;
        }
        int curr = st.pop();
        sortStack(st);
        if (st.isEmpty()) {
            st.push(curr);
        } else {
            push(curr, st);
        }
    }

    public void push(int curr, Stack<Integer> st) {
        if (st.isEmpty() || st.peek() <= curr) {
            st.push(curr);
            return;
        }

        int temp = st.pop();
        push(curr, st);
        st.push(temp);
    }
}
