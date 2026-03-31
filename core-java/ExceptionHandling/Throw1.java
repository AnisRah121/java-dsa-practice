package ExceptionHandling;

public class Throw1 {

    static void main() {
        int age =15;
        if(age>=18){
            System.out.println("Eligible for vote");
        }
        else {
            try{
                throw new InvalidAgeException ("Invalid age");
            }catch (InvalidAgeException e )
            {
                System.out.println(e.getMessage());
            }
        }
        System.out.println("end");
    }
}
