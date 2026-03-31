package LinkedList;
import java.util.LinkedList;


public class MyLinkedList {
    private  Node first=null ;
    private  Node last=null;
    private  int count = 0;


    public void remove(int index)
    {
        if (index==-1||index>=size())
        {
            throw new IndexOutOfBoundsException();
        }
        if(index==0) {
            first = first.next;
            if (first == null)
                 last = null;
                 count--;
                 return ;
        }
        Node curr = first;
        for (int i=1;i<index;i++){
            curr = curr.next;
        }
        curr.next= curr.next.next;
        if (curr.next==null){
            last= curr;
        }
        count--;
    }

    public   int size() {
        return count;
    }

    public void add(Object e)
    {
        if (first == null)
        {
            first = new Node(e,null);
            last = first;
            count++;
            return;
        }
        last.next=new Node(e,null);
        last = last.next;
        count++;
    }

    public void add(int index , Object e )
    {
        if (index==-1||index>=size())
        {
            throw new IndexOutOfBoundsException();
        }
        if(index == 0)
        {
            first = new Node(e,first);
        }
        Node curr = first ;
        for (int i = 1; i <index ; i++) {
            curr=curr.next;
        }
        curr.next = new Node(e,curr.next);
        count++;
    }

    public void reverse(){
        Node prev = null;
        Node curr = first;
        Node next = null;
        while(curr != null)
        {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next ;
        }
        last = first ;
        first = prev ;
    }
    @Override
    public String toString()
    {
        if(first == null)return "[]";
        Node curr = first;
        String s = "["+curr.ele;
        while (curr.next != null){
            curr=curr.next;
            s=s+","+curr.ele;
        }
        s=s+"]";
        return s ;
    }

}
