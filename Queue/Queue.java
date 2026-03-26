package Queue;

public class Queue {
    protected int[] data;
    private int end = 0;
    private static final int DEFAULT_SIZE = 10;

    Queue () {
        this(DEFAULT_SIZE);
    }

    Queue(int size) {
        this.data = new int[size];
    }

    public boolean insert(int item) {
        if (isFull()) {
            System.out.println("Cannot insert in an empty queue");
            return false;
        }
        data[end++] = item;
        return true;
    }

    public int remove () throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot remove from an empty queue");
        }
        int removed = data[0];
        for (int i=1;i<end;i++) {
            data[i-1] = data[i];
        }
        end--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot print from an empty queue");
        }
        return data[0];
    }

    public void display () {
        for (int i=0;i<end;i++) {
            System.out.print(data[i] + " <- ");
        }
        System.out.print("END");
    }

    protected boolean isEmpty() {
        return end == 0;
    }

    protected boolean isFull() {
        return end == data.length;
    }
}
