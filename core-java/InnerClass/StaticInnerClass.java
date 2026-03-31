package InnerClass;
public class StaticInnerClass {
    static int i=10;
    int j =20;

    static  class Inner{
       public void m1(){
           System.out.println(i);
       }

        static void main() {
            System.out.println("main of inner");
        }
    }

    static void main() {
        StaticInnerClass outer = new StaticInnerClass();
        Inner inr = new Inner();
        inr.m1();
        Inner.main();
        System.out.println("Outer main");
    }
}
