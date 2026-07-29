package Leetcode;

import java.util.ArrayDeque;
import java.util.Queue;

public class leetcode_225 {
    class MyStack {
        Queue<Integer> q1 = new ArrayDeque<>();
        Queue<Integer> q2 = new ArrayDeque<>();

        public MyStack() {

        }

        public void push(int x) {
            if (q1.isEmpty()) {
                q2.add(x);
            } else {
                q1.add(x);
            }
        }

        public int pop() {
            if (!q1.isEmpty()) {
                int size = q1.size();
                for (int i = 0; i < size - 1; i++) {
                    q2.add(q1.remove());
                }
                return q1.remove();
            } else {
                int size = q2.size();
                for (int i = 0; i < size - 1; i++) {
                    q1.add(q2.remove());
                }
                return q2.remove();
            }
        }

        public int top() {
            if (!q1.isEmpty()) {
                int size = q1.size();
                for (int i = 0; i < size - 1; i++) {
                    q2.add(q1.remove());
                }
                int x = q1.remove();
                q2.add(x);
                return x;
            } else {
                int size = q2.size();
                for (int i = 0; i < size - 1; i++) {
                    q1.add(q2.remove());
                }
                int x = q2.remove();
                q1.add(x);
                return x;
            }
        }

        public boolean empty() {
            return q2.isEmpty() && q1.isEmpty();
        }
    }

    public static void main(String[] args) {

    }
}
