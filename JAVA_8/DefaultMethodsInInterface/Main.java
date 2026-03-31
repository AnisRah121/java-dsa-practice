package JAVA_8.DefaultMethodsInInterface;

interface  A{
    default void sayGM(){
        System.out.println("Good Morning");
    }
    default void sayGN() {
        System.out.println(" A Good Night");
    }
}
interface  B {
    default void sayGA() {
        System.out.println("Good Afternooon");
    }
    default void sayGN() {
        System.out.println("B Good Night");
    }
}
public class Main implements A,B {
    static void main() {
        Main m = new Main();
//        m.sayGM();
//        m.sayGA();
//        A a =new Main();
//        a.sayGM();
//        B b = new Main();
//        b.sayGA();
        m.sayGN();
    }

    @Override
    public void sayGN() {
        B.super.sayGN();//If we want A thn simply give A
    }
}
