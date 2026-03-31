package LinkedList;

public class Demo2 {
    static void main() {
        Node first = null ;
         first = new Node (10,null);
         first.next = new Node (20,null);
         first.next.next= new Node(30,null);
         first.next.next.next=new Node(40,null);

         Node curr = first;
         while(curr != null)
         {
             System.out.print(curr.ele+"next"+" ");
             curr = curr.next;
         }


    }
}
