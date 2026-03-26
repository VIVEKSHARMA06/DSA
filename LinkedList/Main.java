package LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertLast(1);
        list.insertLast(2);
        list.insertLast(3);
        list.insertLast(4);
        list.insertLast(5);
        // list.insertAt(3, 10);
        // list.delete(2);
        // list.deleteFirst();
        // list.deleteLast();
        list.reverseRecursion();
        list.display();
        
        // DoublyLinkedList list = new DoublyLinkedList();
        // list.insertFirst(5);
        // list.insertFirst(4);
        // list.insertFirst(3);
        // list.insertFirst(2);
        // list.insertFirst(1);
        // list.insertLast(6);
        // list.insertAt(6, 7);
        // list.insertAfter(7, 8);
        // list.insertAfter(4, 100);
        // list.display();

        // CircularLinkedList list = new CircularLinkedList();
        // list.insert(1);
        // list.insert(2);
        // list.insert(3);
        // list.insert(4);
        // list.insert(5);
        // list.delete(1);
        // list.delete(3);
        // list.display();
    }
}
