package InnerClass;

public class LocalInnerClass {
    static void main() {
        class A{
            public void add(int a , int b)
            {
                System.out.println(a+b);
            }
        }
        A a= new A();
        a.add(10,20);
    }

}
