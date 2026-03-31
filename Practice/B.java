package Practice;

class B extends A
{
    int x=20;

    void display()
    {
        System.out.println(x);
        System.out.println(this.x);
        System.out.println(super.x);
    }

    public static void main(String[] args)
    {
        B b=new B();
        b.display();
    }
}
