package Binary_Trees;

public class BST {
    BST () {

    }

    public class Node {
        private int value;
        private int height;
        private Node left;
        private Node right;

        Node (int value) {
            this.value = value;
        }

        public int getValue() {
            return value;
        }
    }
    
    private Node root;

    public int height(Node node) {
        if (node == null) {
            return -1;
        }
        return node.height;
    }

    public boolean isEmpty() {
        return root==null;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    private Node insert(Node node, int value) {
        if (node == null) {
            node = new Node(value);
            return node;
        }
        if (value<node.value) {
            node.left = insert(node.left, value);
        }
        if (value>node.value) {
            node.right = insert(node.right, value);
        }

        node.height = Math.max(height(node.left), height(node.right)) + 1;
        return node; 
    }

    public boolean balanced() {
        return balanced(root);
    }

    private boolean balanced(Node node) {
        if (node == null) {
            return true;
        }

        return Math.abs(height(node.left) - height(node.right)) <=1 && balanced(node.left) && balanced(node.right); 
    }

    public void display() {
        display(root, "Root node: ");
    }

    private void display(Node node, String message) {
        if (node == null) {
            return;
        }
        System.out.println(message + node.value);
        display(node.left, "Left child of " + node.value + " : ");
        display(node.right, "Right child of " + node.value + " : ");
    }

    //pre order traversal
    public void preOrder() {
        preOrder(root);
    }

    private void preOrder(Node node) {
        if (node==null) {
            return;
        }
        System.out.print(node.value + "  ");
        preOrder(node.left);
        preOrder(node.right);
    }

    //in order traversal
    public void inOrder() {
        inOrder(root);
    }

    private void inOrder(Node node) {
        if (node==null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.value + "  ");
        inOrder(node.right);
    }

    //post order traversal
    public void postOrder() {
        postOrder(root);
    }

    private void postOrder(Node node) {
        if (node==null) {
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.value + "  ");
    }
}
