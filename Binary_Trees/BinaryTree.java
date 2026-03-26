package Binary_Trees;
import java.util.Scanner;
public class BinaryTree {
    public BinaryTree () {

    }

    private class Node {
        int value;
        Node left;
        Node right;

        Node (int value) {
            this.value = value;
        }
    }

    private Node root;

    //insert elements
    public void populate(Scanner sc) {
        System.out.println("Enter the root Node : ");
        int value = sc.nextInt();
        root = new Node(value);
        populate(sc,root);
    }

    public void populate(Scanner sc, Node node) {
        System.out.println("Do you want to enter left of " + node.value);
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of left of : " + node.value);
            int value = sc.nextInt();
            node.left = new Node(value);
            populate(sc, node.left);
        }

        System.out.println("Do you want to enter right of " + node.value);
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of right of : " + node.value);
            int value = sc.nextInt();
            node.right = new Node(value);
            populate(sc, node.right);
        }
    }

    public void display() {
        display(root,0);
    }

    public void display (Node node, int level) {
        if (node==null) {
            return;
        }
        display(node.right,level+1);

        if (level!=0) {
            for (int i = 0;i<level-1;i++) {
                System.out.print("|\t\t");
            }
            System.out.println("|-------->" + node.value);
        }
        else {
            System.out.println(node.value);
        }
        display(node.left, level+1);
    }
}
