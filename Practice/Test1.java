package Practice;

public class Test1 {
    static {
        System.out.println("static block in test1");
    }

    static void main() {
        System.out.println("main starts");

        new A();
        new A();
        new A();
        new A();
        System.out.println("main ends");
    }
}
