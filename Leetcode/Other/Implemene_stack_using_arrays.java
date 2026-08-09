package Leetcode.Other;

import java.util.ArrayList;

public class Implemene_stack_using_arrays {
    class ArrayStack {
        ArrayList<Integer> stack = new ArrayList<>();
        int top = -1;

        public ArrayStack() {
        }

        public void push(int x) {
            top++;
            stack.add(x);
        }

        public int pop() {
            if (isEmpty()) {
                return -1;
            } else {
                int n = stack.remove(top);
                top--;
                return n;
            }
        }

        public int top() {
            if (isEmpty())
                return -1;
            return stack.get(top);
        }

        public boolean isEmpty() {
            return top == -1;
        }
    }
}
