package LinkedList;

public class LinkedList {
    
    private Node head;
    private Node tail;
    private int size;

    LinkedList () {
        this.size = 0;
    }

    // print linked list
    public void display() {
        Node temp = head;
        while (temp!=null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("END");
    }

    // Insertion
    public void insertFirst (int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        if (tail==null) {
            tail=head;
        }
        size++;
    }

    public void insertLast (int value) {
        if (tail == null) {
            insertFirst(value);
            return;
        }
        Node node = new Node(value);
        tail.next = node;
        tail = node;
        size++;
    }

    public void insertAt(int index, int value) {
        if (index==0) {
            insertFirst(value);
        }
        else if (index==size) {
            insertLast(value);
        }
        else {
            Node temp = head;
            for (int i=1;i<index;i++) {
                temp = temp.next;
            }
            Node newNode = new Node(value, temp.next);
            temp.next = newNode;
            size++;
        }
    }

    public void insertRecursively (int index, int value) {
        head = insertRecursively(index, value, head);
    }


    private Node insertRecursively(int index, int value, Node node) {
        if (index == 0) {
            Node newNode = new Node(value, node);
            size++;
            return newNode;
        }
        node.next = insertRecursively(--index, value, node.next);
        return node;
    }

    // get any node refrence

    public Node getNode (int index) {
        Node node = head;
        for (int i=0; i<index;i++) {
            node = node.next;
        }
        return node;
    }

    public Node find (int val) {
        Node node = head;
        while (node.next !=null) {
            if (node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // deletion

    public int deleteFirst () {
        int value = head.value;
        head = head.next;
        if (head==null) {
            tail = null;
        }
        size--;
        return value;
    }

    public int deleteLast () {
        if (size<=1) {
            return deleteFirst();
        }
        Node node = getNode(size-2);
        int value = node.next.value;
        node.next = null;
        tail = node;
        size--;
        return value;
    }

    public int delete (int index) {
        if (index == 0) {
            return deleteFirst();
        }
        else if (index==size-1) {
            return deleteLast();
        }
        else {
            Node prev = getNode(index-1);
            int value = prev.next.value;
            prev.next = prev.next.next;
            size--;
            return value;
        }
    }

    // Bubble sort

    public void bubbleSort() {
        bubbleSort(size-1,0);
    }

    public void bubbleSort (int row, int col) {
        if (row==0) {
            return;
        }
        if (col<row) {
            Node first = getNode(col);
            Node second = getNode(col+1);
            if (first.value>second.value) {
                if (first==head) {
                    head = second;
                    first.next = second.next;
                    second.next = first;
                }
                else if (second==tail) {
                    Node prev = getNode(col-1);
                    prev.next = second;
                    tail = first;
                    first.next = null;
                    second.next = first;
                }
                else {
                    Node prev = getNode(col-1);
                    prev.next = second;
                    first.next = second.next;
                    second.next = first;
                }
            }
            bubbleSort(row, col+1);
        }
        else {
            bubbleSort(row-1, col);
        }
    }

    // Recursion Reverse

    public void reverseRecursion() {
        reverseRecursion(head);
    }

    public void reverseRecursion (Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverseRecursion(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }

    private class Node {
        private int value;
        private Node next;

        Node (int value) {
            this.value=value;
        }

        Node (int value, Node node) {
            this.value = value;
            this.next = node;
        }
    }

}
