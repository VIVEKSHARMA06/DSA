package LinkedList;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    CircularLinkedList () {
        this.head = null;
        this.tail = null;
    }

    // print circular linked list
    public void display () {
        Node temp = head;
        if (head!=null) {
            do {
                System.out.print(temp.value + " -> ");
                temp=temp.next;
            }
            while (temp !=head);
        }
        System.out.println("HEAD");
    }

    // insertion
    public void insert (int value) {
        Node node = new Node(value);
        if (head==null) {
            head = node;
            tail = node;
            node.next = head;
        }
        else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
    }

    // delete
    public void delete(int value) {
        if (head == null) return;
        if (head == tail && head.value == value) {
            head = null;
            tail = null;
            return;
        }
        if (head.value == value) {
            head = head.next;
            tail.next = head;
            return;
        }
        Node temp = head;
        do {
            if (temp.next.value == value) {
                if (temp.next == tail) {
                    tail = temp;
                }
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        } while (temp != head);
        System.out.println("Does not exist");
    }

    private class Node {
        private int value;
        private Node next;

        Node (int value) {
            this.value = value;
        }
    }
}
