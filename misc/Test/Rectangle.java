package Test;

public class Rectangle {
    int length;
    int breadth;
    Rectangle(int l ,int b)
    {
        this.length=l;
        this.breadth=b;
    }
    @Override
    public boolean equals(Object arg)
    {
        if (!(arg instanceof Rectangle)) return false;
         Rectangle r = (Rectangle) arg;
         return length==r.length && breadth==r.breadth;
    }

    static void main() {
        Rectangle r1 = new Rectangle(10,20);
        Rectangle r2 = new Rectangle(10,30);
        Rectangle r3 = new Rectangle(10,20);
        System.out.println(r1.equals(r2));
        System.out.println(r1.equals(r3));
        System.out.println(r2.equals(r3));

    }
}
