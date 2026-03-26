package Binary_Trees;
// import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // BinaryTree tree = new BinaryTree();
        // tree.populate(sc);
        // tree.display();
        int[] arr = {5,4,3,6,9,1,7,8};
        BST tree = new BST();
        for (int i=0;i<arr.length;i++) {
            tree.insert(arr[i]);
        }
        tree.display();
    }
    
}
