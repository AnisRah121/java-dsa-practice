package ArrayList;

public class ArrayListImplimentation {
    Object[] arr;
    int c = 0;

    ArrayListImplimentation()
    {
        arr=new Object[5];
    }

    public void add(Object e)
    {
        if (c>=arr.length) {
            Object[] temp = new Object[arr.length + 3];
            for (int i = 0; i < arr.length; i++) {
                temp[i] = arr[i];
            }
            arr = temp;
        }
        arr[c++]=e;

    }
    public int size()
    {
        return c;
    }

    public boolean isEmpty()
    {
        return c==0;
    }

    public void add(int index,Object e)
    {
        if(index<0 ||index>size())
            throw new IndexOutOfBoundsException();

        if(c>=arr.length) {
            Object[] temp = new Object[arr.length + 3];
        }
        Object[] temp;
        for (int i = size()-1; i >=index  ; i++) {
            arr[i+1]=arr[i];
        }
        arr[index]=e;
        c++;
    }
    public void clear()
    {
        arr = new Object[5];
        c=0;
    }

    public void remove(int index)
    {
        if(index<0 ||index>=size())
        {
            throw new IndexOutOfBoundsException();
        }
        for (int i = index+1; i <size() ; i++)
        {
            arr[i]=arr[i+1];
        }
        --c;
        arr[c]=null;
    }

    @Override
    public String toString()
    {
        if(size()==0)return "[]";
        String s="["+arr[0];
        for (int i = 1; i <size() ; i++) {
            s=s+","+arr[i];
        }
        s=s+"]";
        return s;
    }
}
