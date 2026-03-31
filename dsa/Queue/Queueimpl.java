package Queue;

public class Queueimpl {
     Node first ;
     int count;

    public void add(Object ele)
    {
        Node n = new Node(ele);
        if(first==null)
        {
            first.next=n;
            first=first.next;
            count++;
            return;
        }
        Node curr = first;
        while(curr.next!= null){
            curr=curr.next;
            curr.next = n ;
            count++;
        }
    }

    public Object poll ()
    {
        Object key = first.ele;
        first = first.next ;
        count--;
        return key;
    }

    public Object peek()
    {
        return first.ele;
    }

    public int size()
    {
        return count;
    }

    public boolean isEmpty()
    {
        return count==0;
    }

}
