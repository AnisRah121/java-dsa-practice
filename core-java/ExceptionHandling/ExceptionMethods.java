package ExceptionHandling;

public class ExceptionMethods {
    static void main() {

        try{
            System.out.println(10/0);
        }
        catch (ArithmeticException e )
        {

            System.out.println(e.getMessage());
            e.printStackTrace();
        }

    }
}
