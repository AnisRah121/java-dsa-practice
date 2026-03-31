package InnerClass;

public class InnerClass {
    private int i =10;
    final static int j =20;
    class innerClass{
        public void m1(){
            System.out.println(i);
            System.out.println(j);
        }
        static void main() {
            System.out.println("main InnerClass");
        }
    }

    static void main() {
        InnerClass inr  =new InnerClass();
        InnerClass.innerClass inner =inr.new innerClass();
        System.out.println("outer main");
        inner.m1();
        inner.main();
    }
}
