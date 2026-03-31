package LinkedList;

public class Demo {
    static void main() {
        MyLinkedList l = new MyLinkedList();
        l.add(10);
        System.out.println(l);
        l.add(20);
        System.out.println(l);
        l.add(1,30);
        System.out.println(l);
        l.remove(1);
        System.out.println(l);
        l.reverse();
        System.out.println(l);
        l.remove(0);
        System.out.println(l);
        System.out.println(l.size());
    }

}
