package InnerClass;

public class AnonymousInnerClass {
    static void main() {


        I1 i1 = new I1() {
            @Override
            public void m1() {
                I1.super.m1();
            }
            @Override
            public void m2() {
                System.out.println("m2 anonymous");
            }
        };
        i1.m1();
        i1.m2();

    }
}



