
package BinarySearchTree;

import java.util.LinkedList;
import java.util.Queue;

public class BinarySearchtree {

    Node root;
    int count;
    boolean flag;

    public int size() {
        return count;
    }

    public boolean add(int key) {
        flag = true;
        root = add(root, key);
        return flag;
    }

    public Node add(Node n, int key) {
        if (n == null) {
            Node node = new Node(key);
            count++;
            return node;
        }

        if (key < n.key) {
            n.left = add(n.left, key);
        }
        else if (key > n.key) {
            n.right = add(n.right, key);
        }
        else {
            flag = false;
        }

        return n;
    }

    public void Pre_Order() {
        Pre_Order(root);
    }

    public void Post_Order() {
        Post_Order(root);
    }

    public void In_Order() {
        In_Order(root);
    }

    public void Pre_Order(Node n) {
        if (n == null) return;

        System.out.print(n.key + "\t");
        Pre_Order(n.left);
        Pre_Order(n.right);
    }

    public void Post_Order(Node n) {
        if (n == null) return;

        Post_Order(n.left);
        Post_Order(n.right);
        System.out.print(n.key + "\t");
    }

    public void In_Order(Node n) {
        if (n == null) return;

        In_Order(n.left);
        System.out.print(n.key + "\t");
        In_Order(n.right);
    }

    public boolean remove(int key) {
        int before = count;
        root = remove(root, key);
        return count < before; // returns true if removal happened
    }

    public Node remove(Node n, int key) {

        if (n == null) return null;

        if (key < n.key) {
            n.left = remove(n.left, key);
        }
        else if (key > n.key) {
            n.right = remove(n.right, key);
        }
        else {

            if (n.left == null) {
                count--;
                return n.right;
            }
            else if (n.right == null) {
                count--;
                return n.left;
            }
            else {
                count--;
                int successorKey = min(n.right);
                n.right = remove(n.right, successorKey);
                n.key = successorKey;
            }
        }

        return n;
    }

    public int min(Node n) {
        while (n.left != null) {
            n = n.left;
        }
        return n.key;
    }

    public int max(Node n) {
        while (n.right != null) {
            n = n.right;
        }
        return n.key;
    }

    public void level_Order() {

        if (root == null) return;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        while (!q.isEmpty()) {

            Node n = q.poll();
            System.out.print(n.key + "\t");

            if (n.left != null) {
                q.add(n.left);
            }

            if (n.right != null) {
                q.add(n.right);
            }
        }
    }
}