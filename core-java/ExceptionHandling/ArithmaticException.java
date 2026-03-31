package ExceptionHandling;

public class ArithmaticException {
    static void main() {
        System.out.println("anis");
        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e )
        {
            System.out.println("cannot devide");
            System.out.println(e);
        }
        System.out.println("rahman");
    }

}
