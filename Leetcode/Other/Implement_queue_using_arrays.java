package Leetcode.Other;

import java.util.ArrayList;

public class Implement_queue_using_arrays {

    class ArrayQueue {
        ArrayList<Integer> q = new ArrayList<>();

        public ArrayQueue() {
        }

        public void push(int x) {
            q.add(x);
        }

        public int pop() {
            if (isEmpty())
                return -1;
            return q.remove(0);
        }

        public int peek() {
            if (isEmpty())
                return -1;
            return q.get(0);
        }

        public boolean isEmpty() {
            return q.size() == 0;
        }

    }
}
