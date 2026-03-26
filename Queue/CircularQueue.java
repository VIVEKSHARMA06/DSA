package Queue;

public class CircularQueue {
    protected int[] data;
    private int front = 0;
    private int end = 0;
    private int size = 0;
    private static final int DEFAULT_SIZE = 10;

    CircularQueue () {
        this(DEFAULT_SIZE);
    }

    CircularQueue(int size) {
        this.data = new int[size];
    }

    public boolean insert (int item) {
        if (isFull()){
            System.out.println("Queue is full");
            return false;
        }
        data[end++] = item;
        end = end%data.length;
        size++;
        return true;
    }

    public int remove () throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot remove from an empty queue");
        }
        int removed = data[front++];
        front = front%data.length;
        size--;
        return removed;
    }

    public int front() throws Exception {
        if (isEmpty()) {
            throw new Exception("Cannot print from an empty queue");
        }
        return data[front];
    }

    public void display() {
        if(isEmpty()) {
            System.out.println("Queue is Empty");
            return;
        }
        int i = front;
        do {
            System.out.print(data[i] + " <- ");
            i++;
            i %= data.length;
        } while (i!=end);
        System.out.print("END");
    }

    protected boolean isEmpty() {
        return size == 0;
    }

    protected boolean isFull() {
        return size == data.length;
    }
}
