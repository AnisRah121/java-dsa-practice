package DoublyLinkedList;
import java.util.LinkedList;

public class DoublyLinkedList {
   private Node first= null;
    private Node last = null;
    private int count = 0;
    private Object size;


    public void remove(int index) {
        if (index==-1||index>size())
        {
            throw new IndexOutOfBoundsException();
        }
        if(index==0)
        {
            first=first.next;
            if(first!= null)
            {
                first.prev=null;
            }
            if(first.next == null)
            {
                first.prev=null;
            }
            count--;
            return;
        }
        if(index==size()-1)
        {
            last.prev.next=null;
            last=last.prev;
            count--;
            return;
        }
        Node curr = first;
        for (int i = 1; i<index ; i++){
            curr= curr.next;
        }
        curr.prev.next=curr.next;
        curr.next.prev=curr.prev;
        count--;
    }


    public int size(){
        return count;
    }


    public void add(Object e){
        if (first==null)
        {
            first=new Node(e);
            last=first;
            count++;
            return;
        }
        last.next=new Node(e,last,null);
        last = last.next;
        count++;
    }


    public void add(int index ,Object e){
        if (index==-1||index>size())
        {
            throw new IndexOutOfBoundsException();
        }
        if(index==0)
        {
            first = new Node(e);
            last = first;
            count++;
            return;
        }

        if(index == size()){
            Node n = new Node(e);
            last.next=n;
            n.prev= last;
            last = n;
            count++;
            return;
        }
        Node curr = first ; 
        for(int i = 1; i<index;i++) {
            curr=curr.next;
        }
        Node n = new Node(e,curr,curr.next);
        curr.next.prev=n;
        curr.next=n;
        count++;
        
    }

    public void display(){
        Node curr = first ;
        while (curr!=null){
            System.out.print(curr.ele+" ");
            curr=curr.next;
        }
        System.out.println();
    }

    public void revDisplay(){
        Node curr = last;
        while (curr != null){
            System.out.print(curr.ele+" ");
            curr = curr.prev;
        }
        System.out.println();
    }

}
