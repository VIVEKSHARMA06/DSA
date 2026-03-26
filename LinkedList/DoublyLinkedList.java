package LinkedList;

public class DoublyLinkedList {
    
    int size;
    Node head;

    // print Linked List
    public void display () {
        Node temp = head;
        Node last = null;
        while (temp!=null) {
            System.out.print(temp.value + " -> ");
            last = temp;
            temp = temp.next;
        }
        System.out.println("END");

        System.out.println("Display in Reverse :-");
        while (last!=null) {
            System.out.print(last.value + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    public Node find (int val) {
        Node node = head;
        while (node !=null) {
            if (node.value == val) {
                return node;
            }
            node = node.next;
        }
        return null;
    }

    // insertion
    public void insertFirst (int value) {
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if (head!=null) {
            head.prev = node;
        }
        head = node;
        size++;
    }

    public void insertLast (int value) {
        Node node = new Node(value);
        Node temp = head;
        if (head==null) {
            insertFirst(value);
            return;
        }
        while (temp.next!=null) {
            temp = temp.next;
        }
        temp.next = node;
        node.prev = temp;
        node.next = null;
        size++;
    }

    public void insertAt (int index, int value) {
        if (index==0) {
            insertFirst(value);
        }
        else if (index==size) {
            insertLast(value);
        }
        else {
            Node node = new Node(value);
            Node temp = head;
            for (int i=1; i<index; i++) {
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next.prev = node;
            temp.next = node;
            node.prev = temp;
            size++;
        }
    }

    public void insertAfter (int after, int value) {
        Node p = find(after);

        if (p==null) {
            System.out.println("Does not exist");
        }

        Node node = new Node(value);
        node.next = p.next;
        node.prev = p;
        p.next = node;
        if (node.next!=null) {
            node.next.prev = node;
        }
    }

    DoublyLinkedList () {
        this.size = 0;
    }
    
    private class Node {
        private int value;
        private Node next;
        private Node prev;

        Node (int value) {
            this.value = value;
        }
    }
}
