package Stack;



public class Stack {
    Node first ;
    int count = 0;

    public void push (Object ele)
    {
        Node n = new Node( ele);
        if (first==null)
        {
            first = n;
            count++;
            return;
        }
        n.next=first;
        first = n;
        count++;
        return;
    }

    public Object pop()
    {
        if(first == null) return null;
        Object key = first.ele;
        first = first.next;
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
