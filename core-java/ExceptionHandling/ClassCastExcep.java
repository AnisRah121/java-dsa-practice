package ExceptionHandling;
class A{

}
class  B extends A{

}
class  C extends A {

}
public class ClassCastExcep {
    static void main() {

        A a=new B();

        try{
            C c = (C) a;
        }catch (Exception e)
        {
            System.out.println( e);
            System.out.println( e.getMessage());

            System.out.println("not possible");
            e.printStackTrace();
        }
    }
}
