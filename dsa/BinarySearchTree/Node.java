package BinarySearchTree;

public class Node {

    Node left ;
    int key ;
    Node right;
    Node (int ele )
    {
        this.key=ele;
    }
    Node (Node left , int ele , Node right){
        this.left= left;
        this.key=ele;
        this.right = right;
    }
}
