package Binary_Trees;

public class SegmentTrees {

    private static class Node {
        int data;
        int startInterval;
        int endInterval;
        Node left;
        Node right;

        Node (int startInterval, int endInterval) {
            this.startInterval = startInterval;
            this.endInterval = endInterval;
        }
    }

    private Node root;

    SegmentTrees(int[] arr){
        this.root = constructTree(arr, 0, arr.length-1);
    }

    private Node constructTree(int[] arr, int start, int end) {
        if (start == end) {
            Node leaf = new Node(start, end);
            leaf.data = arr[start];
            return leaf;
        }

        Node node = new Node(start, end);
        int mid = (start+end)/2;
        node.left = constructTree(arr, start, mid);
        node.right = constructTree(arr, mid+1, end);
        node.data =  node.left.data + node.right.data;
        return node;     
    }

    //query
    public int query(int qsi, int qei) {
        return query(this.root, qsi, qei);
    }

    private int query(Node node, int qsi, int qei) {
        if (node.startInterval >= qsi && node.endInterval <= qei) {
            return node.data;
        }
        else if (node.startInterval > qei || node.endInterval < qsi) {
            return 0;
        }
        else {
            return query(node.left, qsi, qei) + query(node.right, qsi, qei); 
        }
    } 

    //update
    public int update(int index, int value) {
        return update(this.root, index, value);
    }

    private int update (Node node, int index, int value) {
        if (node.startInterval < index && node.endInterval > index) {
            if (node.startInterval==index && node.endInterval==index) {
                node.data = value;
                return node.data;
            }
            else {
                node.data = update(node.left, index, value) + update(node.right, index, value);
                return node.data;
            }
        }
        return node.data;
    }
}
