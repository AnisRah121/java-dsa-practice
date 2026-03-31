package DoublyLinkedList;

public class Node {
    Object ele;
    Node prev;
    Node next;
    Node(Object e)
    {
        ele = e;
        prev = next = null;
    }
    Node(Object e , Node p , Node n)
    {
        ele = e;
        next  = n;
        prev = p;
    }

}
