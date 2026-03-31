package Practice;

class  D
{
    void m1()
    {
        System.out.println("m1");
    }
}
class  E extends D
{
    void m2()
    {
        System.out.println("m2");
    }
}
class  F extends E
{
    void m3()
    {
        System.out.println("m3");
    }
}
class Test9
{
    public static void main(String[] args)
    {
        F f1 = new F();
        f1.m1();
        f1.m2();
        f1.m3();
        E e=f1;
        e.m1();
        e.m2();

        D d = f1;
        d.m1();

    }
}
